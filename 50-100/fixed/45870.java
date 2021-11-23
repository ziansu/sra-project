public java.util.ArrayList<java.lang.Integer> getRawResourcesIds() {
    java.util.ArrayList<java.lang.Integer> IDs = new java.util.ArrayList<>();
    for (java.lang.String name : getRawResourcesNames()) {
        int id = getApplicationContext().getResources().getIdentifier(name, "raw", "com.example.user1.absolute");
        IDs.add(id);
    }
    return IDs;
}