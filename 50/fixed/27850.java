public java.util.ArrayList<com.idiotsapps.chaoenglish.Word> getWords() {
    words = HelperApplication.sMySQLiteHelper.getWords(this.grade, this.unitName);
    return words;
}