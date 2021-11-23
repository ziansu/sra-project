@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    main.Statics.reading = false;
    mongodb.DatabaseManager.storeDataInDB();
    setSessionInfoText("Session stopped");
    gui.clearExtraParts();
}