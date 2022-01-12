public static boolean isIdExist(final java.lang.String newId) throws org.parse4j.ParseException {
    data.management.DBManager.initialize();
    final java.lang.String objectClass = "Driver";
    java.lang.System.out.println("i was here 2");
    java.util.Map<java.lang.String, java.lang.Object> key = new java.util.HashMap<java.lang.String, java.lang.Object>();
    key.put("id", newId);
    java.lang.System.out.println("i was here 2.5");
    return (data.management.DBManager.getObjectFieldsByKey(objectClass, key).isEmpty()) == false;
}