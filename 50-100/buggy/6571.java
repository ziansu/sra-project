public void run() {
    if (main_package.MapUpdaterGUI.DEBUG)
        java.lang.System.out.println("Calling run");
    
    main_package.MapUpdaterGUI mapUpdater = new main_package.MapUpdaterGUI();
    try {
        java.lang.System.out.println("Calling create and show GUI");
        mapUpdater.createAndShowGUI();
    } catch (java.io.IOException | database.AlreadyExistsException | java.sql.SQLException e) {
        e.printStackTrace();
    }
}