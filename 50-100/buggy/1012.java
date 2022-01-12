public boolean addSymbol(java.lang.String id, java.lang.String type) {
    if (((currentLevel) >= 0) && (!(isSet(id)))) {
        levels.get(currentLevel).put(id, new tadsemantico.Symbol(id, type));
        return true;
    }
    return false;
}