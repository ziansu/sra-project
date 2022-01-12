private int getFinPhrase(int position) {
    if (position >= (corpus.size())) {
        java.lang.System.err.println("La position n'est pas dans le corpus");
        return -1;
    }
    int i = position;
    int size = corpus.size();
    while ((i < size) && ((corpus.get(i)) != (tableau_suffixe.MonolingualCorpus.val_$$))) {
        i++;
    } 
    if (i == size) {
        return i;
    }
    return i + 1;
}