public void onClick(android.view.View v) {
    if ((selectedLevel) == 0) {
        levelDetailsView.setText("Select a Level above first.");
    }else {
        android.content.Intent customisationLaunch = new android.content.Intent(getApplicationContext(), sg.com.yahoo.ryanlouck.orbital2015.CustomisationActivity.class);
        customisationLaunch.putExtra("level", selectedLevel);
        customisationLaunch.putExtra("levelDetails", levelDetails.get(selectedLevel));
        customisationLaunch.putExtra("award", levelAwards[((selectedLevel) - 1)]);
        startActivity(customisationLaunch);
    }
}