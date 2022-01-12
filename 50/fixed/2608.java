public void event(org.gessinger.gepard.xmp.Event e) {
    (n)++;
    try {
        e.sendBack();
    } catch (java.lang.Exception exc) {
    }
}