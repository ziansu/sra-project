public void showVocableData(com.matteoveroni.wordsremember.pojo.Word vocableToShow) {
    if (!(shownVocable.equals(vocableToShow))) {
        if ((vocableToShow.getId()) < 0) {
            lbl_title.setText("Create vocable");
        }else {
            lbl_title.setText("Edit vocable");
        }
        txt_vocableName.setText(vocableToShow.getName());
        shownVocable = vocableToShow;
    }
}