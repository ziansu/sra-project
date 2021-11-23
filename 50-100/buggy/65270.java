private void createMoodEntry() {
    java.lang.String moodDescription = "No mood description entered.";
    if ((moodDesc.getText()) != null)
        moodDescription = moodDesc.getText().toString();
    
    entry = new team10.studentwellbeingapp.MoodEntry(date, java.lang.String.valueOf(sliderValue), moodDescription);
}