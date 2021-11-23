public void act() {
    mw = ((MyWorld) (getWorld()));
    if (((MyWorld) (getWorld())).getState().name.equals("Playing")) {
        if ((mw.getObjects(Message.class).size()) != 0)
            mw.removeWaitMsg();
        
        mw.play();
    }else {
        try {
            mw.end();
        } catch (java.lang.Exception e) {
        }
    }
}