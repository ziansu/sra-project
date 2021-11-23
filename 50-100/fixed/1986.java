public void getNextPath(android.view.View view) {
    android.widget.EditText verificationCode = ((android.widget.EditText) (findViewById(R.id.verificationCode)));
    com.example.mortuie.bathlaunchpad2017.GettingData gd = new com.example.mortuie.bathlaunchpad2017.GettingData();
    if (gd.getValueOfWebsite().trim().equals(verificationCode.getText().toString().trim())) {
        addPoints();
        generateNextPath();
        (mapPoint)++;
    }
}