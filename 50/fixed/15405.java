@java.lang.Override
public void onClick(android.view.View view) {
    if ((selectedButton) != null) {
        selectedButton.setBackgroundColor(Color.RED);
        selectedButton = null;
    }
}