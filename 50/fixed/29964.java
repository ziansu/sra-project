public boolean validateWord(model.Word guess) {
    model.Word target = wordbank.gettargetWord();
    return target.equals(guess);
}