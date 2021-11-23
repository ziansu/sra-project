private void resolve_1_Enemies(java.util.ArrayList<java.util.ArrayList<edu.chl.blastinthepast.utils.Collidable>> collision) {
    for (edu.chl.blastinthepast.utils.Collidable c : collision.get(0)) {
        if (c instanceof edu.chl.blastinthepast.utils.EnemyView) {
            ((edu.chl.blastinthepast.utils.EnemyView) (c)).setCollision();
            ((edu.chl.blastinthepast.utils.EnemyView) (c)).update();
        }
    }
}