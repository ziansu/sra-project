private void generateGem(int x, int y) {
    do {
        gems[x][y] = new main.Gem(main.GemColor.randomColor());
        this.add(gems[x][y]);
        java.lang.System.out.println(((((("ADDING GEM AT X: " + x) + " Y: ") + y) + " COLOR: ") + (gems[x][y].getColor().toString())));
    } while (invalidColor(x, y) );
}