private com.example.whatsmymood.Mood makeMood() {
    if ((this.date) == null) {
        mood = new com.example.whatsmymood.Mood(this.moodAuthor, this.moodType);
    }else {
        mood = new com.example.whatsmymood.Mood(this.moodAuthor, this.moodType, this.date);
    }
    mood.setMoodMsg(this.moodMsg);
    mood.setLocation(this.location);
    mood.setSocialSit(this.socialSit);
    mood.setPhoto(com.example.whatsmymood.AddMoodController.mPhoto);
    return mood;
}