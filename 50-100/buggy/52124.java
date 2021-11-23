public void takeTurn(int Round) {
    do {
        if ((RoundCount) == 0) {
            this.firstScore = score;
            this.Sumofscore = this.firstScore;
            java.lang.System.out.print((("Your first score is " + (this.Sumofscore)) + " "));
        }
        (RoundCount)++;
    } while (DrawAgain() );
}