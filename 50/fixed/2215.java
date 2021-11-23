@Test
public void clear_clearMembers_0() {
    Member testMember = new Member("Lincoln");
    Member.clear();
    assertEquals(0, Member.all().size());
}