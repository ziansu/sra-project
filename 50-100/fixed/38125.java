@java.lang.Override
public int getNoOfCharactersWithPositiveConfidenceForQuestionId(java.util.List<java.lang.Character> characters, long questionId) {
    int count = 0;
    java.util.Iterator<java.lang.Character> it = characters.iterator();
    ai.profX.model.Confidence confidence;
    while (it.hasNext()) {
        java.lang.Character character = it.next();
        confidence = confidenceRepo.findByCharacterIdAndQuestionId(character.getCharId(), questionId);
        if ((confidence != null) && ((confidence.getValue()) > 0)) {
            count++;
        }
    } 
    return count;
}