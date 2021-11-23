private void resolve_1_Enemies(java.util.ArrayList<java.util.ArrayList<edu.chl.blastinthepast.utils.Collidable>> collision) {
    for (edu.chl.blastinthepast.utils.Collidable c : collision.get(0)) {
        if (c instanceof edu.chl.blastinthepast.utils.EnemyView) {
            java.lang.System.out.println("collisionEVSE!!!");
            ((edu.chl.blastinthepast.utils.EnemyView) (c)).setCollision();
            java.lang.System.out.println("setCollision");
            ((edu.chl.blastinthepast.utils.EnemyView) (c)).update();
            java.lang.System.out.println("update_1");
        }
    }
}