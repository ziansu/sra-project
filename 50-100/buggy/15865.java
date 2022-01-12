protected boolean save_current_word() {
    java.lang.String word = editWord.getText().toString();
    java.lang.String wordTrad = editWordTrans.getText().toString();
    if ((word != "") || (wordTrad != "")) {
        word_obj = new com.example.furry_octo_waddle.sql_manager.Word_Translation(word, wordTrad, word_obj.getId());
        if ((word_obj.getId()) > 0)
            MainActivity.cbd.modifyWordbyId(word_obj);
        else
            MainActivity.cbd.writeWord(word_obj);
        
        return true;
    }
    return false;
}