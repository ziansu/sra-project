void regListeners() {
    getPluginManagers().registerEvents(new com.khillynn.PlayerLoginEventListener(), this);
    java.lang.System.out.println(" ********** just registered PlayerLoginEventListener()");
}