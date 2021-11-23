private holay.team.memorycards.Card setCardPtr(int num) {
    holay.team.memorycards.Card ptr = null;
    int i = 0;
    if (num != (-1)) {
        while ((ptr == null) && (i < (listOfCards.size()))) {
            if (num == (listOfCards.get(i).getButton().getId())) {
                ptr = listOfCards.get(i);
            }else {
                i++;
            }
        } 
    }
    return ptr;
}