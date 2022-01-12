public void update(int i) {
    if (((score) >= 0) && ((score) <= 9)) {
        if (i > 0) {
            circles[score].setColor(turquoise);
        }else {
            circles[score].setColor(turquoise2);
        }
    }
    score += i;
}