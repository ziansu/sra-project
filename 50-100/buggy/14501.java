private void resolve_2_Player(java.util.ArrayList<java.util.ArrayList<edu.chl.blastinthepast.utils.Collidable>> collision) {
    for (edu.chl.blastinthepast.utils.Collidable c : collision.get(0)) {
        if (c instanceof edu.chl.blastinthepast.utils.PlayerView) {
            ((edu.chl.blastinthepast.utils.PlayerView) (c)).setCollision();
            ((edu.chl.blastinthepast.utils.PlayerView) (c)).updatePosition();
            java.lang.System.out.println("resolved_2");
        }
    }
}