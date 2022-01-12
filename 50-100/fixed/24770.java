protected final void point(org.eclipse.swt.widgets.Event e) {
    for (int i = (snapshot.length) - 1, I = 0; i >= I; i--) {
        de.dualuse.swt.widgets.Layer r = snapshot[i];
        if ((((e.doit) && ((r.captive()) == (captive))) && (r.isVisible())) && (r.isEnabled()))
            r.point(e);
        
    }
}