public void assignCardValues(int low, int high) {
    for (int i = 0; i <= (cardNames.length); i++) {
        if (i = cardNames.length) {
            cardValues[i] = 0;
        }else
            if ((i + 2) > high) {
                cardValues[i] = high;
            }else
                cardValues[i] = i + low;
            
        
    }
}