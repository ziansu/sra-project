@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String m_Text = input.getText().toString();
    int m_int = java.lang.Integer.parseInt(m_Text);
    if (m_int <= (paramBarControl2.getMax())) {
        paramBarControlText2.setText(m_Text);
        paramBarValue2 = m_int;
        paramBarControl2.setProgress(m_int);
        messageBox.setText(R.string.valueSuccess);
    }else {
        messageBox.setText(java.lang.String.format(getResources().getString(R.string.valueError), paramBarControl2.getMax()));
    }
}