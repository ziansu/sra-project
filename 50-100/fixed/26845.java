@java.lang.Override
public void run() {
    if (code == 204) {
        follow_button.setEnabled(true);
        follow_button.setText("Unfollow");
        isFollow = false;
    }else
        if (code == 404) {
            follow_button.setEnabled(true);
            follow_button.setText("follow");
            isFollow = true;
        }
    
}