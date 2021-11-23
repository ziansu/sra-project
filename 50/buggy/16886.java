public void run() {
    java.lang.System.out.println("Servant run method started");
    java.awt.image.BufferedImage pic = null;
    while (true) {
        try {
            performAction();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    } 
}