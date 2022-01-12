private void setButtonState(android.view.View iB) {
    switch (TURN) {
        case 'X' :
            iB.setBackground(cont.getResources().getDrawable(R.drawable.cell_button_x));
            TURN = 'O';
            break;
        case 'O' :
            iB.setBackground(cont.getResources().getDrawable(R.drawable.cell_button_o));
            TURN = 'X';
            break;
        default :
            iB.setBackground(cont.getResources().getDrawable(R.drawable.cell_default));
            break;
    }
}