public edu.purdue.cs490.ArrayList<java.lang.String> getNames() {
    edu.purdue.cs490.ArrayList<java.lang.String> listOfNames;
    java.util.Iterator availableUsers = listOfUsers.entrySet().iterator();
    int counter = 1;
    while (availableUsers.hasNext()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (availableUsers.next()));
        listOfNames.add(pair.getKey());
    } 
    return listOfNames;
}