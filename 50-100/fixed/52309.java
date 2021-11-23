public static void main(java.lang.String[] args) {
    DataStructure.Pixel pixel = new DataStructure.Pixel();
    pixel.setId(1);
    Animations.Animation animation = new Animations.Animation(pixel, new java.awt.Color(10, 100, 200));
    Animations.AnimationManager animationManager = new Animations.AnimationManager(100, new ArduinoConnector.ArduinoConnector());
    animationManager.addAnimation(10, 60, animation);
    animationManager.start();
}