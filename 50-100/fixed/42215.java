private void addWordtoVerse(java.lang.String verse, java.lang.String wordStr) {
    if ((wordStr.isEmpty()) || (verse.isEmpty())) {
        org.pmw.tinylog.Logger.warn("PoenWords.addWordtoVerse: parameter is empty!");
        return ;
    }
    if (matchedVerses.containsKey(wordStr)) {
        poemstar.beans.Verses v = matchedVerses.get(wordStr);
        v.addVerse(verse);
    }else {
        poemstar.beans.Verses v = new poemstar.beans.Verses();
        v.addVerse(verse);
        matchedVerses.put(wordStr, v);
    }
}