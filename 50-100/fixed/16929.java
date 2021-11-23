public java.util.List<java.lang.String> getUsersList(java.util.List<java.lang.Integer> buildList) {
    userString = new java.util.ArrayList<java.lang.String>();
    for (int position = 0; position < (buildList.size()); position++) {
        userString.add(userInBuildChange.get(position));
    }
    return userString;
}