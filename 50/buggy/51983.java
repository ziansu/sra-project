public void run() {
    try {
        player.play();
        java.lang.System.out.println("XYZ");
        player.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}