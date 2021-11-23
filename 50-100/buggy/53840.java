public void multiplechoicemultiple() {
    android.widget.LinearLayout tfbox = ((android.widget.LinearLayout) (findViewById(R.id.TrueFalseOption)));
    android.widget.TableLayout mcbox = ((android.widget.TableLayout) (findViewById(R.id.MultipleChoice)));
    tfbox.setVisibility(View.GONE);
    mcbox.setVisibility(View.VISIBLE);
}