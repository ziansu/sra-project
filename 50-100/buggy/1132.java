@java.lang.Override
public java.awt.Point play() {
    hasPlayed = false;
    caseJouee = null;
    while ((!(hasPlayed)) && ((caseJouee) == null)) {
        try {
            java.lang.System.out.println(((name) + " attend"));
            java.lang.Thread.sleep(500);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
    return caseJouee;
}