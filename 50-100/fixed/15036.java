private void win() {
    int starsToGo = hs.ladder.model.Ladder.get()[currentRang];
    ++(winStreak);
    int stars = addedStars();
    if (((curStars) + stars) < starsToGo) {
        curStars += stars;
    }else {
        --(currentRang);
        curStars = ((curStars) + stars) - starsToGo;
    }
}