private void checkId(final java.lang.String newId) throws java.lang.IllegalArgumentException, java.lang.InterruptedException, org.parse4j.ParseException {
    java.lang.System.out.println("i was here");
    if (newId == null)
        throw new java.lang.IllegalArgumentException("id can not be empty!");
    
    java.lang.String result = util.Validation.isIdExist(newId);
    java.lang.Thread.sleep(6000);
    java.lang.System.out.println("dieeeee");
    if ((result != null) && (!(newId.equals(this.id))))
        throw new java.lang.IllegalArgumentException("id is alreay exist!");
    
    return ;
}