public boolean haveAnswer() {
    return ((answers) != null) || (((getUnrelaxedAnswer()) != null) && (getUnrelaxedAnswer().equals(getQuestion())));
}