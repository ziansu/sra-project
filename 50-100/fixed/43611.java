@java.lang.Override
public void mousePressed(processing.core.PApplet pApplet) {
    if ((metro) == null) {
        metro = new synthpp.Metronome();
        java.lang.Thread t = new java.lang.Thread(metro);
        t.start();
    }else {
        metro.end();
        metro = null;
    }
}