private int findNNPEnd(java.util.List<uk.gov.dstl.baleen.types.language.WordToken> tokens, int firstToken) {
    int end = tokens.get(firstToken).getEnd();
    for (int j = firstToken + 1; j < (tokens.size()); j++) {
        if ("NNP".equals(tokens.get(j).getPartOfSpeech())) {
            end = tokens.get(j).getEnd();
        }
    }
    return end;
}