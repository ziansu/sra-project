public boolean hasReadAllRules(java.util.UUID player) {
    if ((pagesRead.get(player).size()) == (pages))
        return true;
    
    return false;
}