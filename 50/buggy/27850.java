public java.util.ArrayList<com.idiotsapps.chaoenglish.Word> getWords() {
    if ((words.size()) == 0) {
        words = HelperApplication.sMySQLiteHelper.getWords(this.grade, this.unitName);
    }
    return words;
}