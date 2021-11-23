public void finishTask(java.lang.String title) {
    final org.openstreetmap.josm.gui.SplashScreen.Task task = org.openstreetmap.josm.tools.Utils.find(tasks, org.openstreetmap.josm.tools.Predicates.<org.openstreetmap.josm.gui.SplashScreen.Task>equalTo(new org.openstreetmap.josm.gui.SplashScreen.MeasurableTask(title)));
    if ((task != null) && (task instanceof org.openstreetmap.josm.gui.SplashScreen.MeasurableTask)) {
        ((org.openstreetmap.josm.gui.SplashScreen.MeasurableTask) (task)).finish();
        org.openstreetmap.josm.Main.debug(org.openstreetmap.josm.tools.I18n.tr("{0} completed in {1}", title, ((org.openstreetmap.josm.gui.SplashScreen.MeasurableTask) (task)).duration));
        listener.stateChanged(null);
    }
}