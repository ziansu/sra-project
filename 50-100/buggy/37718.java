@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast t = android.widget.Toast.makeText(this, "", Toast.LENGTH_SHORT);
    android.util.Log.e("ASDFSDF", getResources().getResourceEntryName(v.getId()));
    if ((getResources().getResourceEntryName(v.getId()).charAt(2)) == (correct)) {
        corr.setVisibility(View.VISIBLE);
    }else {
        t.setText("Incorrect!");
    }
    t.show();
}