private void setPrefferedWindowSize() {
    if ((env.containsProperty(Constants.DEFAULT_WINDOW_HEIGHT)) && (env.containsProperty(Constants.DEFAULT_WINDOW_WIDTH))) {
        int height = env.getProperty(Constants.DEFAULT_WINDOW_HEIGHT, java.lang.Integer.class).intValue();
        int width = env.getProperty(Constants.DEFAULT_WINDOW_WIDTH, java.lang.Integer.class).intValue();
        getContentPane().setPreferredSize(new java.awt.Dimension(width, height));
    }
    pack();
}