public void update_stats(int win, int new_standing) {
    int diff = (standing) - new_standing;
    update_change(diff);
    standing = new_standing;
    if (win == 1) {
        (streak)++;
        (wins)++;
    }else
        if (win == 0) {
            streak = 0;
            (losses)++;
        }
    
}