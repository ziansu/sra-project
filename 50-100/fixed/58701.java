private com.example.whatsmymood.Mood updateMood() {
    mood.setMoodType(this.moodType);
    mood.setMoodMsg(this.moodMsg);
    mood.setLocation(this.location);
    mood.setSocialSit(this.socialSit);
    if ((this.date) == null) {
        mood.setDate(new java.util.Date());
    }else {
        mood.setDate(this.date);
    }
    mood.setPhoto(com.example.whatsmymood.AddMoodController.mPhoto);
    com.example.whatsmymood.AddMoodController.mPhoto = null;
    return mood;
}