private void updateDate(int year, int month, int day) {
    android.util.Log.i(com.puskin.sticky.home.EditSticky.EDIT_STICKY, ("Current Month==>" + month));
    android.widget.TextView txt = ((android.widget.TextView) (findViewById(R.id.dueDateText)));
    txt.setText(new java.lang.StringBuilder().append(day).append('-').append(month).append('-').append(year));
}