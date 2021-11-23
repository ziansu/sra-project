@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.fathzer.android.keyboard.DecimalKeyboard mCustomKeyboard = new net.yapbam.android.keyboard.AutoHideDecimalKeyboard(this, R.id.keyboardview, R.xml.deckbd);
    mCustomKeyboard.registerEditText(R.id.amount);
    addItemsOnSpinner2();
}