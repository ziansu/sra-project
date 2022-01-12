public int getSum() {
    int sum = 0;
    for (int row = 0; row < (this.rows); row++) {
        for (int column = 0; column < (this.columns); (columns)++) {
            Model.ScoreBoard.ScoreBoardCell cell = this.getCell(row, column);
            sum += cell.getValue();
        }
    }
    return sum;
}