void setChecked(android.widget.TextView t1, android.widget.TextView t2, android.widget.ImageView i1, java.lang.String description_in) {
    i1.setImageResource(R.drawable.ic_check_box_black_24dp);
    t1.setTextColor(android.support.v4.content.ContextCompat.getColor(getApplicationContext(), R.color.PrimaryPink));
    if ((t2 != null) && (!(description_in.isEmpty()))) {
        t2.setText(description_in);
    }
}