@java.lang.Override
public boolean isGameOver() {
    return ((getWinner()) != null) || ((mMacroField.getWinner()) != (-1));
}