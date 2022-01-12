private boolean isRequiredWordFirst(sg.edu.nus.comp.cs3219.model.Line line) {
    java.lang.String key = line.getWord(0);
    return ((requiredWords.isEmpty()) || (requiredWords.contains(key))) || (requiredWords.contains(key.toLowerCase()));
}