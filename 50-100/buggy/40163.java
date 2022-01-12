public java.lang.String getSuffixFromPosition(int position) {
    int pos_debut_phrase = getDebutPhrase(position);
    int pos_fin_phrase = getFinPhrase(position);
    java.lang.String suffixe = "";
    for (int i = pos_debut_phrase; i < pos_fin_phrase; i++) {
        suffixe = (suffixe + (getTokenAtPosition(corpus.get(i)))) + " ";
    }
    return suffixe.substring(0, ((suffixe.length()) - 2));
}