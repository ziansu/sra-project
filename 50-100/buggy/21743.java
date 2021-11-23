@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i) {
    if (mn071102.isChecked()) {
        mn071102x.setVisibility(View.VISIBLE);
        mn071103x.setVisibility(View.GONE);
        mn071103x.setText(null);
    }else
        if (mn071103.isChecked()) {
            mn071103x.setVisibility(View.VISIBLE);
            mn071102x.setVisibility(View.GONE);
            mn071102x.setText(null);
        }
    
}