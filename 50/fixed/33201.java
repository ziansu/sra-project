@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    main.Statics.reading = false;
    setSessionInfoText("Session stopped");
    gui.clearExtraParts();
}