public static void main(java.lang.String[] args) {
    edu.stanford.nlp.Tagging t = new edu.stanford.nlp.Tagging();
    java.lang.String sent = "Showers continued throughout the week in the Bahia cocoa zone.";
    java.util.List l = t.searchByTag(t.TaggingSentence(sent), "NN");
    java.lang.System.out.println(l);
}