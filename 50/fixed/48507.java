public com.pkhope.diary.model.Diary createDiary(java.lang.String date, java.lang.String week, java.lang.String content) {
    com.pkhope.diary.model.Diary diary = new com.pkhope.diary.model.Diary(date, week, content);
    saveOnServer(diary);
    return diary;
}