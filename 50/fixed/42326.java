public boolean isComplete() {
    if ((cardList.get(((cardList.size()) - 1)).getValue()) == 13)
        return true;
    
    return false;
}