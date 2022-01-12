@java.lang.Override
public void onClick(android.view.View view) {
    if ((current) < (total)) {
        updateScore();
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