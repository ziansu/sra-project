public boolean setSessionsToAttend(java.util.ArrayList<java.lang.Integer> list, int registrationID) {
    try {
        for (java.lang.Integer i : list) {
            java.lang.System.out.println((("Sesjon nr " + i) + " skal være lagt til."));
            jdbcTemplateObject.update(setSessionsToAttend, new java.lang.Object[]{ i , registrationID });
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("Error in setSessionsToAttend() " + e));
        return false;
    }
    return true;
}