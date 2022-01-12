public void actionPerformed(java.awt.event.ActionEvent arg0) {
    (tictactoe_main.chance)++;
    if (((tictactoe_main.chance) % 2) == 0) {
        tictactoe_main.button_4.setText("X");
        tictactoe_main.arr[6] = 1;
    }else
        if (((tictactoe_main.chance) % 2) == 1) {
            tictactoe_main.button_4.setText("O");
            tictactoe_main.arr[6] = -1;
        }
    
    check();
}