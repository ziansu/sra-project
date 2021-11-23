public void saveUnsavedData() {
    org.md2k.thoughtshakeup.Questions.getInstance().setEndTime(org.md2k.datakitapi.time.DateTime.getDateTime());
    org.md2k.thoughtshakeup.Questions.getInstance().setStatus(Constants.ABANDONED_BY_TIMEOUT);
    org.md2k.thoughtshakeup.QuestionAnswer.getInstance(this).add(new org.md2k.thoughtshakeup.QuestionsJSON(org.md2k.thoughtshakeup.Questions.getInstance()));
    org.md2k.thoughtshakeup.Questions.getInstance().destroy();
}