private void setPrefferedWindowSize() {
    if ((env.containsProperty(Constants.DEFAULT_WINDOW_HEIGHT)) && (env.containsProperty(Constants.DEFAULT_WINDOW_WIDTH))) {
        java.lang.Integer height = env.getProperty(Constants.DEFAULT_WINDOW_HEIGHT, java.lang.Integer.class);
        java.lang.Integer width = env.getProperty(Constants.DEFAULT_WINDOW_WIDTH, java.lang.Integer.class);
        if ((height != null) && (width != null))
            getContentPane().setPreferredSize(new java.awt.Dimension(width.intValue(), height.intValue()));
        
    }
    pack();
}