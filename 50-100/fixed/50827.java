@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.RadioButton rb = ((android.widget.RadioButton) (rbgVote.findViewById(rbgVote.getCheckedRadioButtonId())));
    if (rb != null) {
        android.widget.Toast.makeText(getApplicationContext(), rb.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}