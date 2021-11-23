@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Button btn = ((android.widget.Button) (v));
    if (m_answer.equals(btn.getText().toString())) {
        unlockHomeButton();
    }else {
        btn.setBackgroundColor(Color.RED);
    }
}