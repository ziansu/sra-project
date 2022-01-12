@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        android.widget.Toast toastMessage = android.widget.Toast.makeText(this, "The count has now been reset", Toast.LENGTH_LONG);
        toastMessage.show();
        count = 0;
        txt.setText((("The button was tapped " + (count)) + " times"));
        btn.setTranslationX(btnX);
        btn.setTranslationY(btnY);
        return true;
    }
    return super.onOptionsItemSelected(item);
}