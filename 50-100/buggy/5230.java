public void update_stats(boolean win, int new_standing) {
    int diff = (standing) - new_standing;
    update_change(diff);
    standing = new_standing;
    if (win) {
        (streak)++;
        (wins)++;
    }else {
        streak = 0;
        (losses)++;
    }
}