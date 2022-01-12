@java.lang.Override
public void onClick(android.view.View view) {
    updateScore();
    if ((current) < (total)) {
        nextAnagram();
    }
    if ((current) == (total)) {
        nextButton.setText("Results");
    }
    if ((current) > (total)) {
        toResults();
    }
    (current)++;
}