@org.dspace.content.Test
public void testGetSupervisorGroups_0args() throws java.lang.Exception {
    org.dspace.eperson.Group[] found = si.getSupervisorGroups();
    assertThat("testGetSupervisorGroups_0args 0", found, notNullValue());
    assertTrue("testGetSupervisorGroups_0args 1", ((found.length) == 1));
    boolean added = false;
    for (org.dspace.eperson.Group g : found) {
        if (g.equals(gr)) {
            added = true;
        }
    }
    assertTrue("testGetSupervisorGroups_0args 2", added);
}