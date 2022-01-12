public static void checkButtons(int x, int y) {
    for (int i = 0; i < (com.project.BattleUI.buttons.length); i++) {
        if (com.project.BattleUI.buttons[i].isInside(x, y)) {
            com.project.BattleUI.buttons[i].activated();
        }
    }
}