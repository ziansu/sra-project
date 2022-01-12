public static void main(java.lang.String[] args) {
    Baseroom b = new Baseroom(10, 3, 3);
    b.createMonsterMed();
    Hero player = new Hero("Isaac", 10, 3, 3, 683, 385);
    b.addThing(player, 683, 385);
    Game g = new Game(b, player);
    java.awt.Toolkit.getDefaultToolkit().sync();
    g.setVisible(true);
}