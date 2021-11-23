private static int cmdList(org.dspace.core.Context context, java.lang.String[] argv) {
    try {
        for (org.dspace.eperson.EPerson person : org.dspace.eperson.EPersonCLITool.ePersonService.findAll(context, EPerson.EMAIL)) {
            java.lang.System.out.printf("%s\t%s/%s\t%s, %s\n", person.getID(), person.getEmail(), person.getNetid(), person.getLastName(), person.getFirstName());
        }
    } catch (java.sql.SQLException ex) {
        java.lang.System.err.println(ex.getMessage());
        return 1;
    }
    return 0;
}