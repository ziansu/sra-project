public int findMultiWord(java.util.List<edu.stanford.nlp.ling.CoreLabel> tokens, int startIndex, java.util.List<java.lang.String> synset) {
    if ((startIndex + 1) < (tokens.size()))
        return startIndex + (findMultiWord(tokens.get(startIndex), tokens.subList((startIndex + 1), tokens.size()), synset));
    else
        return startIndex;
    
}