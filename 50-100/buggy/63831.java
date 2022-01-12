public void setP(int x, int y) {
    eP = new EPosition();
    xP = new PositionX(eP);
    xP.setPosition(x);
    yP = new PositionY(xP);
    yP.setPosition(y);
    iP = yP;
    java.lang.System.out.println(iP.getPosition());
}