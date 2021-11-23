@org.testng.annotations.Test
public void testToString() {
    teammates.common.datatransfer.attributes.StudentProfileAttributes spa = new teammates.common.datatransfer.attributes.StudentProfileAttributes(profile.toEntity());
    profile.modifiedDate = spa.modifiedDate;
    assertEquals(profile.toString(), spa.toString());
}