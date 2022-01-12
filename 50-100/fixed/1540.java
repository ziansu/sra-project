public static void main(java.lang.String[] args) {
    game.SplashScreen s = new game.SplashScreen("resources/Sprites_400/Splash/splash.png");
    s.showSplashScreen(true);
    javax.swing.JFrame window = new javax.swing.JFrame("Prince Of Persia");
    window.setContentPane(new game.Game());
    window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.pack();
    window.setLocationRelativeTo(null);
    window.setVisible(true);
    s.showSplashScreen(false);
}