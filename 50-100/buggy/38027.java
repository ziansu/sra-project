public void endPanels() {
    int i = 0;
    for (view.DrawPanel p : panels) {
        if (i == 0) {
            p.toggleEnd();
            java.lang.System.out.println("--(!) ENDING");
            java.lang.System.out.println(p.model.getOptimumRoute().toString());
        }
        i++;
    }
    this.updatePanels(true);
}