public void run() {
    for (; ;) {
        if (!(model.getPaused())) {
            model.updateScene(view.getWidth(), view.getHeight());
            try {
                java.lang.Thread.sleep(10);
            } catch (java.lang.InterruptedException e) {
            }
        }
        view.repaint();
    }
}