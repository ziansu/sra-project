public void responseFromUser(java.lang.String username, boolean accept) {
    if (!accept) {
        feedBackLabel.setText((username + " declined your invitation"));
    }
}