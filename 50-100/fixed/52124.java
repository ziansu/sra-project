public void takeTurn() {
    do {
        if ((RoundCount) == 0) {
            this.firstScore = score;
            this.Sumofscore = this.firstScore;
            java.lang.System.out.println((("Your first score is " + (this.Sumofscore)) + " "));
        }
        (RoundCount)++;
    } while (DrawAgain() );
}