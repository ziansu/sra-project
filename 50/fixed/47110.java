public boolean gameOver() {
    return (((currentYear) * 12) + (currentMonth)) > (((FINAL_YEAR) * 12) + (FINAL_MONTH));
}