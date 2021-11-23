@java.lang.Override
public void mouseMoved(java.awt.event.MouseEvent e) {
    model.Animation hero = controller.getAnimation("fly");
    hero.setPosX(e.getX());
    hero.setPosY(e.getY());
    controller.checkCollision();
}