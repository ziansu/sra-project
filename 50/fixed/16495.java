public boolean checkAnswer(java.lang.String hash) {
    for (java.lang.String h : this.answers) {
        if (hash.equals(h)) {
            return true;
        }
    }
    return false;
}