public java.lang.String getEntryForMappingElement(int index, int elemNo) {
    java.lang.String result = new java.lang.String();
    try {
        if ((hashtable.get(index)) != null) {
            result = ((java.lang.String) (hashtable.get(index))).split(",")[elemNo];
        }
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Database cannot find object" + index));
        e.printStackTrace();
    }
    return result;
}