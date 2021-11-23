private void AditionalOptions(int index) {
    if (marriageInHand()) {
        wonCardsValue += 20;
        if (isPowerMarriage()) {
            wonCardsValue += 20;
        }
        return ;
    }
    switchCards();
}