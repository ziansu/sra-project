public static void main(java.lang.String[] args) {
    try {
        example.AppGameContainer appgc;
        appgc = new example.AppGameContainer(new example.RoskildeVolunteerLoungeVisualClient("Simple Slick Game"));
        appgc.setDisplayMode(1920, 1080, false);
        appgc.setShowFPS(false);
        appgc.setTargetFrameRate(24);
        appgc.start();
    } catch (example.SlickException ex) {
        java.util.logging.Logger.getLogger(example.RoskildeVolunteerLoungeVisualClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}