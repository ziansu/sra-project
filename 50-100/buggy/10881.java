public void start() {
    try {
        common.Player.replace(Paint.width, Paint.height, Paint.diameterPlayer);
    } catch (java.awt.AWTException e) {
        e.printStackTrace();
    }
    frame.GameFrame.puck.setPuckPos((((common.Paint.width) / 2) - ((common.Paint.diameterPuck) / 2)), (((common.Paint.height) / 2) - ((common.Paint.diameterPuck) / 2)));
}