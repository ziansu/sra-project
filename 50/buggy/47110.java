public boolean gameOver() {
    return (isDead) || ((((currentYear) * 12) + (currentMonth)) >= (((FINAL_YEAR) * 12) + (FINAL_MONTH)));
}