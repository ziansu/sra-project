private void runAlgorithm() {
    btnRunAlgo.setEnabled(false);
    writeNewPostToDB();
    compareTastes();
    fbIdArr = getFbIdStrArr();
    java.util.Collections.sort(cTaste, new com.example.gad.themovie_180617.Model.UsersTasteComparator());
    goToShowRecAlgoMovies();
}