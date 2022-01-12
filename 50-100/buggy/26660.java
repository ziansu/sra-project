public void renderAnimation(java.awt.Graphics2D g2) {
    for (control.AnimationController ac : animations) {
        switch (ac.getAnimation()) {
            case OYSTER :
                ac.playCollectOysterAnimation(g2);
                break;
            case PLACEGABION :
                ac.playGabionPlacementAnimation(g2);
                ac.playGabionPlacementAnimation(g2);
                break;
            default :
                break;
        }
    }
}