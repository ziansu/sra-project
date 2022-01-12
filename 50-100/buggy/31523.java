public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    java.lang.System.out.print(("FIELD: i am listening and my id is: " + (f.getID())));
    java.lang.System.out.print("\n - - - - - - - - - - - - - - - - - \n");
    if ((isUnitSelected) && (diceRolled)) {
        moveUnit(rolledDiceValue, f, selectedUnit);
    }
}