@java.lang.Override
public void onClick(android.view.View view) {
    textColor = android.graphics.Color.parseColor("#0000ff");
    mEditor.setTextColor((isChanged ? android.graphics.Color.GREEN : android.graphics.Color.BLUE));
    isChanged = !(isChanged);
}