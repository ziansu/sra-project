public int getCountRegistrations(int courseId) {
    int i = 0;
    try {
        i = ((int) (jdbcTemplateObject.queryForObject(sqlGetCountRegistrations, new java.lang.Object[]{ courseId }, java.lang.Integer.class)));
        java.lang.System.out.println(("******************************************************************" + i));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Feil i getCountReg");
    }
    return i;
}