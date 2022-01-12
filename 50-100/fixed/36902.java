public void actionPerformed(java.awt.event.ActionEvent arg0) {
    (tictactoe_main.chance)++;
    if (((tictactoe_main.chance) % 2) == 0) {
        tictactoe_main.btnNewButton.setText("X");
        tictactoe_main.arr[0] = 1;
    }else
        if (((tictactoe_main.chance) % 2) == 1) {
            tictactoe_main.btnNewButton.setText("O");
            tictactoe_main.arr[0] = -1;
        }
    
    tictactoe_main.btnNewButton.setEnabled(false);
    check();
}