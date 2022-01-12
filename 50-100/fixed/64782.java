public static void main(java.lang.String[] args) {
    controller.GraphicsController game1 = new controller.GraphicsController();
    controller.GraphicsController game2 = new controller.GraphicsController();
    java.lang.Thread g1 = new java.lang.Thread(game1);
    java.lang.Thread g2 = new java.lang.Thread(game2);
    g1.start();
    g2.start();
}