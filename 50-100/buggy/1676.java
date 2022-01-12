public void setKill(int kill) {
    kills += kill;
    kk.setKill(kills);
    kk.tact();
    GreenfootImage bg2 = new GreenfootImage(bg);
    bg2.setFont(new java.awt.Font("SERIF", java.awt.Font.BOLD, 24));
    bg2.setColor(java.awt.Color.white);
    bg2.drawString(("" + (kills)), 675, 40);
}