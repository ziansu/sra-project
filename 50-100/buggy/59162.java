@java.lang.Override
public void learn(java.lang.String newWord) {
    this.alternativeCounter = 0;
    newWord.toLowerCase();
    t12.spinphone.WordObject word = new t12.spinphone.WordObject(newWord);
    this.lexicon.add(word);
    saveLexicon(lexicon, "SpinPhone.lex");
    java.lang.System.out.println((("Ein neues Wort wurde erfolgreich eingetragen, die neue Lexikongröße beträgt " + (this.lexicon.size())) + " Wörter"));
}