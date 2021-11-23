private void incCurrentQuizz() {
    quizzService.changeCurrentQuizz();
    heroService.resetBonusForAll();
}