private void updateWowButtonText(boolean wowed, int wowCount) {
    if (wowed) {
        if (wowCount == 1) {
            wowStatText.setText("You WoWed this.");
            newWowButton.setChecked(true);
        }else {
            wowStatText.setText((("You and other " + (wowCount - 1)) + " WoWed."));
            newWowButton.setChecked(true);
        }
    }else {
        wowStatText.setText((wowCount + " WoWs"));
        newWowButton.setChecked(false);
    }
}