public java.util.ArrayList<java.lang.String> getNames() {
    java.util.ArrayList<java.lang.String> listOfNames = new java.util.ArrayList<java.lang.String>();
    java.util.Iterator availableUsers = listOfUsers.entrySet().iterator();
    int counter = 1;
    while (availableUsers.hasNext()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (availableUsers.next()));
        listOfNames.add(pair.getKey().toString());
    } 
    return listOfNames;
}