public void drawHorse(HorseSea.HorseSea horse) {
    HorseSea.Coordinate coor = getCoordinate(horse);
    horse.setIcon(iconHorse);
    horse.getLabel().setBounds(coor.x, coor.y, 30, 30);
    mapPanel.add(horse.getLabel());
    mainFrame.setVisible(true);
}