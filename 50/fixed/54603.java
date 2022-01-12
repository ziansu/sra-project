@java.lang.Override
public void onGameDraw() {
    turnTextBox.setText("");
    android.widget.Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
    board.setEnabled(false);
}