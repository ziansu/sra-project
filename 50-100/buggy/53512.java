private void checkWinLose(org.newdawn.slick.state.StateBasedGame sbg, org.newdawn.slick.GameContainer gc) throws org.newdawn.slick.SlickException {
    if ((arena.players.size()) == 1) {
        sbg.getState(Main.STATSSTATE).init(gc, sbg);
        sbg.enterState(Main.STATSSTATE);
        calculateHitPercent();
    }else
        if (arena.players.isEmpty()) {
            sbg.getState(Main.STATSSTATE).init(gc, sbg);
            sbg.enterState(Main.STATSSTATE);
            calculateHitPercent();
        }
    
}