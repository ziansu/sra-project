public static void loadUser(java.lang.String name) {
    if (com.CMPUT301W15T02.teamtoapp.MainManager.isNetworkAvailable(com.CMPUT301W15T02.teamtoapp.MainManager.applicationContext)) {
        com.CMPUT301W15T02.teamtoapp.ElasticSearchManager.loadUser(name);
    }else {
        com.CMPUT301W15T02.teamtoapp.LocalDataManager.loadUser();
    }
}