@java.lang.Override
public void onClick(android.view.View view) {
    if (view == (buttonLogIn)) {
        CandidateLogIn();
    }
    if (view == (textViewregister)) {
        finish();
        startActivity(new android.content.Intent(this, com.example.hp.hireme.HIREME.class));
    }
}