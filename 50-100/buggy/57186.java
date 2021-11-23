@java.lang.Override
public void shoot(model.Shooter shooter, int px, int py) {
    model.Missile m = new model.Missile(shooter.getXofMissileShoot(), shooter.getYofMissileShoot(), px, py, java.awt.Color.RED);
    synchronized(Main.gameData.friendFigures) {
        Main.gameData.friendFigures.add(m);
    }
}