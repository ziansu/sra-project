private void permuteFinding() {
    while ((initialPermute[watchPerson]) == (sentinel)) {
        initialPermute = this.permuteBranchBound();
        initialPermute = this.getLexes(initialPermute);
    } 
}