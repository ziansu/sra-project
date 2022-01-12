public boolean checkOrgUnit(java.lang.String orgUnit) {
    boolean result = false;
    try {
        if ((getUIDCheckProgramClosedDate(orgUnit)) != "null")
            result = true;
        
    } catch (java.lang.Exception e) {
        result = false;
        e.printStackTrace();
    }
    return result;
}