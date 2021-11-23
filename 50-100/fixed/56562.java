public void editStreaks(int errors) {
    if (errors == 0) {
        (currentStreak)++;
        longestStreak = ((currentStreak) > (longestStreak)) ? (longestStreak) + 1 : longestStreak;
        if ((((currentStreak) % 2) == 0) && ((currentStreak) != 0)) {
            bonusMultiplicateur = (bonusMultiplicateur) * 2;
        }
    }else {
        currentStreak = 1;
        bonusMultiplicateur = 1;
    }
}