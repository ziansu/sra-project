public void editStreaks(int errors) {
    if (errors == 0) {
        (currentStreak)++;
        longestStreak = ((currentStreak) > (longestStreak)) ? (longestStreak) + 1 : longestStreak;
        if ((currentStreak) > 1) {
            bonusMultiplicateur = (bonusMultiplicateur) * 2;
            currentStreak = 0;
        }
    }else {
        currentStreak = 0;
        bonusMultiplicateur = 1;
    }
}