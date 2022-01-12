@org.junit.Test
public void removeMemberTest() {
    JsonObject memberJson = TestUtils.readJsonObjectFromFile(((RegistryTest.JSON_FILE_DIR) + "member.json"));
    RegistryTest.registry.addMember(memberJson);
    long memberID = RegistryTest.getMemberBySsn(RegistryTest.registry, memberJson.getString("socialSecurityNumber")).getMemberID();
    RegistryTest.registry.removeMember(memberID);
    assertNull(RegistryTest.registry.getMember(memberID));
}