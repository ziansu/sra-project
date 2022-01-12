private void drawPlayer() {
    try {
        dbg.drawImage(player1.getImage(), ((int) (player1.getX())), ((int) (player1.getY())), this);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("drawPlayer graphics error:" + e));
    }
}