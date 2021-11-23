public static void main(java.lang.String[] args) {
    java.lang.Thread buildCubeAnimation = new java.lang.Thread(new animations.BuildCube());
    buildCubeAnimation.start();
    World.getInstance().start();
    ui.VisualGUI.main(args);
}