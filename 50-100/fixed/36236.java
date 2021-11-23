public void pushNewCard(int stackNumber, models.Card someCard) {
    if (someCard != null) {
        switch (stackNumber) {
            case 1 :
                stack1[numCardsStack1] = someCard;
                (numCardsStack1)++;
                break;
            case 2 :
                stack2[numCardsStack2] = someCard;
                (numCardsStack2)++;
                break;
            case 3 :
                stack3[numCardsStack3] = someCard;
                (numCardsStack3)++;
                break;
            case 4 :
                stack4[numCardsStack4] = someCard;
                (numCardsStack4)++;
                break;
            default :
                break;
        }
    }
}