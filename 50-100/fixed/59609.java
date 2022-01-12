@java.lang.Override
public void run() {
    while (locationStatusOn) {
        try {
            ((northseattlecollege.ASLBuddy.MenuInterpreter) (menuInterpreter)).sendLocationToServer();
            java.lang.Thread.sleep((360 * 1000));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    } 
}