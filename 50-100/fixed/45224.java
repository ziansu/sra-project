@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    if ((s.length()) != 0)
        seekBar.setProgress(java.lang.Integer.valueOf(editTextBPM.getText().toString()));
    
}