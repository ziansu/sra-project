public boolean hasReadAllRules(java.util.UUID player) {
    if (pagesRead.isEmpty())
        return false;
    
    if ((pagesRead.get(player).size()) == (pages))
        return true;
    
    return false;
}