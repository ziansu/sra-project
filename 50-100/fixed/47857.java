protected void pushcomp() {
    if (!(((choSung) != 0) && ((jwungSung) != 0))) {
        wordValid = 0;
    }
    char[] jamos = new char[]{ choSung , jwungSung , jongSung };
    Syllables.add(org.apache.lucene.search.spell.korean.KoHangul.convertJamosToHangulSyllable(jamos));
    clearComp();
}