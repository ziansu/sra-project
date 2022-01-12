private void createBullet() {
    java.awt.Image bulletImg = new javax.swing.ImageIcon("../graphics/playerBullet.png").getImage();
    Animation anim = new Animation();
    anim.addFrame(bulletImg, 1000);
    theBullet = new Bullet(anim, ((getX()) + ((getWidth()) / 2)), ((getY()) - ((getHeight()) / 2)), true, screenMaxY, screenMinY);
    return ;
}