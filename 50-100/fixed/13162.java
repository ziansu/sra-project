private void paintCollisionDebug(java.awt.Graphics2D screen, java.util.Vector target, java.awt.Dimension tileSize, double screenWidth, double screenHeight) {
    screen.setColor(java.awt.Color.MAGENTA);
    java.util.List<se.liu.ida.carro311rolsi701.tddd78.carlorolf.ArenaObject> temp1 = new java.util.ArrayList(arena.getObjects());
    for (se.liu.ida.carro311rolsi701.tddd78.carlorolf.ArenaObject object : temp1) {
        object.getBody().draw(screen, target, tileSize, screenWidth, screenHeight);
    }
}