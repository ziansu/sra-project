@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String m_Text = input.getText().toString();
    int m_int = java.lang.Integer.parseInt(m_Text);
    if (m_int <= (paramBarControl1.getMax())) {
        paramBarControlText1.setText(m_Text);
        paramBarValue1 = m_int;
        paramBarControl1.setProgress(m_int);
        messageBox.setText(R.string.valueSuccess);
    }else {
        error.setText(java.lang.String.format(getResources().getString(R.string.valueError), paramBarControl1.getMax()));
    }
}