@java.lang.Override
public void run() {
    boolean worked = false;
    while (!worked) {
        try {
            nifty.getScreen("save_dialog").findNiftyControl("saveTextField", de.lessvoid.nifty.controls.TextField.class).setText(app.savedAlien.getName());
            worked = true;
        } catch (java.lang.NullPointerException e) {
            try {
                java.lang.Thread.sleep(20);
            } catch (java.lang.InterruptedException ex) {
                java.util.logging.Logger.getLogger(julietgroupproject.GUI.MainMenuController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            worked = false;
        }
    } 
}