public tadsemantico.Symbol search(int level, java.lang.String id) {
    while (level >= 0) {
        if (levels.get((level--)).containsKey(id))
            return ((tadsemantico.Symbol) (levels.get((level + 1)).get(id)));
        
    } 
    return null;
}