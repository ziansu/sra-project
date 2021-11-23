public void addPoints(int points) {
    if (((this.points) + points) < (this.pointsForKraken))
        this.points += points;
    else
        this.points = this.pointsForKraken;
    
}