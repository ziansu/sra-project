@java.lang.Override
public boolean longClick(com.example.dell.minesweeper.GridButton button) {
    if (button.isFlaged()) {
        button.setBackground(button.getOriginal());
        button.setFlaged(false);
        button.setClickable(true);
    }else {
        button.setBackgroundResource(R.drawable.israel);
        button.setFlaged(true);
        button.setClickable(false);
    }
    return true;
}