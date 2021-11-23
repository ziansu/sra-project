public void setTip(int tip) {
    tipBar = ((org.adw.library.widgets.discreteseekbar.DiscreteSeekBar) (findViewById(R.id.tip_spinner)));
    tipText = ((android.widget.EditText) (findViewById(R.id.tip_textView)));
    tipBar.setProgress(tip);
    tipText.setText(java.lang.Integer.toString(tip));
}