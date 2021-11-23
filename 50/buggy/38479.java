public void updatePanels(boolean done) {
    if (done) {
        for (view.DrawPanel p : panels) {
            p.finalUpdate();
        }
    }else {
        for (view.DrawPanel p : panels) {
            p.update();
        }
    }
}