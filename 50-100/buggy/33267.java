public de.dhbw.mbfl.jconnect4lib.board.Streak searchLongestStreak(de.dhbw.mbfl.jconnect4lib.board.Position startPoint) {
    java.util.ArrayList<de.dhbw.mbfl.jconnect4lib.board.Streak> streaks = this.searchStreaks(startPoint);
    de.dhbw.mbfl.jconnect4lib.board.Streak longestStreak = null;
    int longestStreakLength = 1;
    for (de.dhbw.mbfl.jconnect4lib.board.Streak s : streaks) {
        if ((s.getStreakLength()) > longestStreakLength) {
            longestStreak = s;
        }
    }
    return longestStreak;
}