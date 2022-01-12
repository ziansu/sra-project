public void shutDown() {
    java.lang.System.out.println("Shutting down database ...");
    qa.datahelper.UserHelper.db.shutdown();
}