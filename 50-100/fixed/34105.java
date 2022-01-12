public int getDebutPhrase(int position) {
    if (position >= (corpus.size())) {
        java.lang.System.err.println("La position n'est pas dans le corpus");
        return -1;
    }
    int i = position;
    while ((i > 0) && ((corpus.get(i)) != (tableau_suffixe.MonolingualCorpus.val_$$))) {
        i--;
    } 
    if (i == 0) {
        return i;
    }
    return i + 1;
}