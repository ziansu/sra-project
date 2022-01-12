public void addScoreToChart(java.lang.String scoreType, int value) {
    android.widget.TableRow tr = mRowMap.get(scoreType);
    final android.widget.TextView tv = ((android.widget.TextView) (tr.getChildAt(1)));
    tv.setText(java.lang.Integer.toString(value));
    tr.setClickable(false);
    android.widget.Toast.makeText(getActivity(), R.string.score_added, Toast.LENGTH_SHORT).show();
}