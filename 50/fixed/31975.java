private void addMood() {
    android.content.Intent intent = new android.content.Intent(this, com.cmput301w17t08.moodr.AddMoodActivity.class);
    startActivityForResult(intent, 1);
}