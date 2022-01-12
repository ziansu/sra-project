private void setButtonState(android.view.View iB) {
    switch (TURN) {
        case 'X' :
            iB.setBackground(cont.getResources().getDrawable(R.drawable.cell_button_x));
            iB.setEnabled(false);
            TURN = 'O';
            break;
        case 'O' :
            iB.setBackground(cont.getResources().getDrawable(R.drawable.cell_button_o));
            TURN = 'X';
            iB.setEnabled(false);
            break;
        default :
            iB.setBackground(cont.getResources().getDrawable(R.drawable.cell_default));
            break;
    }
}