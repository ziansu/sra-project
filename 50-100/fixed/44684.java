protected void handleClick(uk.ac.starlink.ttools.plot2.Navigator<A> navigator, uk.ac.starlink.ttools.plot2.Surface surface, java.awt.Point pos, int ibutt, java.lang.Iterable<double[]> dposIt) {
    uk.ac.starlink.ttools.plot2.NavAction<A> navact = navigator.click(surface, pos, ibutt, dposIt);
    if (navact != null) {
        updateDecoration(navact.getDecoration(), true);
        A aspect = navact.getAspect();
        if (aspect != null) {
            setAspect(aspect);
        }
    }
}