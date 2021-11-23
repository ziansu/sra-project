private void handleLeaveScreenEvent(game.event.LeaveScreenEvent leaveScreenEvent) {
    org.cogaen.java2d.Screen screen = org.cogaen.java2d.SceneManager.getInstance(getCore()).getScreen();
    if (leaveScreenEvent.getSide().equals(LeaveScreen.LEFT)) {
        this.body.setPositionX(((-(screen.getWidth())) / 2));
    }else
        if (leaveScreenEvent.getSide().equals(LeaveScreen.RIGHT)) {
            this.body.setPositionX(((-(screen.getWidth())) / 2));
        }
    
}