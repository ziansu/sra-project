public java.util.List<java.lang.String> getUsersList(java.util.List<java.lang.Integer> buildList) {
    userString = new java.util.ArrayList<java.lang.String>();
    for (int i : buildList) {
        int position = builds.indexOf(i);
        userString.add(userInBuildChange.get(position));
    }
    return userString;
}