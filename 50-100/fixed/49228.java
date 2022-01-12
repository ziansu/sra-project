private boolean checkId(final java.lang.String newId) throws java.lang.IllegalArgumentException, org.parse4j.ParseException {
    java.lang.System.out.println("i was here");
    if (newId == null)
        return false;
    
    boolean result = util.Validation.isIdExist(newId);
    java.lang.System.out.println("dieeeee");
    if ((result == true) && (!(newId.equals(this.id))))
        return false;
    
    return true;
}