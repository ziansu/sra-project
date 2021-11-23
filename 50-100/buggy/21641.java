public void setKiShoot(java.lang.String ship, java.lang.String gegner, java.lang.String pos, java.lang.String orientation) {
    java.lang.String text = (((((ship + ";") + gegner) + ";") + pos) + ";") + orientation;
    server.setAttack(text);
}