public boolean isComplete() {
    if ((cardList.peek().getValue()) == 13)
        return true;
    
    return false;
}