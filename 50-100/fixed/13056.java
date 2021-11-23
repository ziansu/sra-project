public boolean isMatched() {
    switch (matchingType) {
        case OR :
            return matches.values().contains(true);
        case AND :
        default :
            return ((matches.size()) > 0) && (!(matches.values().contains(false)));
    }
}