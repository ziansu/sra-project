public void run() {
    for (; ;) {
        if (!(model.getPaused())) {
            model.updateScene(view.getWidth(), view.getHeight());
            view.repaint();
            try {
                java.lang.Thread.sleep(10);
            } catch (java.lang.InterruptedException e) {
            }
        }
    }
}