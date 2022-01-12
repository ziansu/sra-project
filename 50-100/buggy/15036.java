private void win() {
    int starsToGo = hs.ladder.model.Ladder.get()[currentRang];
    ++(winStreak);
    int stars = addedStars();
    if (starsToGo > ((curStars) + stars)) {
        curStars += stars;
    }else {
        --(currentRang);
        if (stars == 1) {
            curStars = 0;
        }else {
            curStars = 1;
        }
    }
}