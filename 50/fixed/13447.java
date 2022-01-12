private void permuteFinding() {
    while ((initialPermute[watchPerson]) == (sentinel)) {
        this.permuteBranchBound();
        this.getLexes(initialPermute);
    } 
}