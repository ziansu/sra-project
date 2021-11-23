@java.lang.Override
protected void init() {
    length = com.mygdx.hangman.screens.GameplayScreen.word.length();
    java.lang.System.out.println(com.mygdx.hangman.screens.GameplayScreen.word);
    starting_x = com.mygdx.hangman.entities.ChooseCategory.STARTING_X_2;
    starting_y = com.mygdx.hangman.entities.ChooseCategory.STARTING_Y_2;
    initBars();
    showBars();
}