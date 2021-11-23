@java.lang.Override
public void selectGridDimension() {
    game.setWidth(20);
    game.setHeight(20);
    remove(eraPanel);
    loadWindow();
}