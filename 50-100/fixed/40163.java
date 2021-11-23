public java.lang.String getSuffixFromPosition(int position) {
    int pos_debut_phrase = position;
    int pos_fin_phrase = getFinPhrase(position);
    java.lang.String suffixe = "";
    for (int i = pos_debut_phrase; i < (pos_fin_phrase - 1); i++) {
        suffixe = (suffixe + (getTokenAtPosition(corpus.get(i)))) + " ";
    }
    return suffixe;
}