@java.lang.Override
public void onClick(android.view.View v) {
    int count = sharedPref.getInt("Hamburger", 0);
    if (count > 0) {
        count--;
        editor.putInt("Hamburger", count);
        editor.commit();
        hamCount.setText(java.lang.Integer.toString(count));
    }
}