private void scanForBots(java.util.ArrayList<util.QueryObject> list) {
    userObject = new util.UserObject(list);
    java.lang.System.out.println(userObject.checkForFrequentQueries());
    if (userObject.checkForFrequentQueries()) {
        userObject.printUserObject();
    }
}