public void showAllMines() {
    for (int i = 0; i < (field.length); i++) {
        for (int j = 0; j < (field.length); j++) {
            if (field[i][j].isMine())
                field[i][j].setText(au.edu.griffith.util.Constant.MINE);
            
        }
    }
}