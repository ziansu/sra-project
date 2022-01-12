@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast t = android.widget.Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT);
    if ((getResources().getResourceEntryName(v.getId()).charAt(2)) == (correct)) {
        corr.setVisibility(View.VISIBLE);
    }else {
        t.show();
    }
}