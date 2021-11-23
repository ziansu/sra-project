public void startWorkout(android.view.View view) {
    android.content.Intent startIntent = new android.content.Intent(this, cs321.customstrength.ValidateWorkout.class);
    if ((MyPrograms.programs.size()) > 0) {
        startIntent.putExtra("CURRENT_PROGRAM", cs321.customstrength.MainActivity.currentProgIndex);
        startIntent.putExtra("CURRENT_WEEK", cs321.customstrength.MainActivity.currentWeek);
        startIntent.putExtra("CURRENT_DAY", cs321.customstrength.MainActivity.currentDay);
        startActivity(startIntent);
        finish();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "No workout to start yet.", Toast.LENGTH_LONG).show();
    }
}