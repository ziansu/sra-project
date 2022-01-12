public static void saveUnsavedData(android.content.Context context) {
    org.md2k.thoughtshakeup.Questions.getInstance().setEndTime(org.md2k.datakitapi.time.DateTime.getDateTime());
    org.md2k.thoughtshakeup.Questions.getInstance().setStatus(Constants.ABANDONED_BY_TIMEOUT);
    org.md2k.thoughtshakeup.QuestionAnswer.getInstance(context).add(new org.md2k.thoughtshakeup.QuestionsJSON(org.md2k.thoughtshakeup.Questions.getInstance()));
    org.md2k.thoughtshakeup.Questions.getInstance().destroy();
}