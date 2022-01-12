boolean match(char c) {
    return ((characters.contains(c)) || (((negated.size()) > 0) && (!(negated.contains(c))))) || (all);
}