public void addScore(java.lang.Integer score) {
    AggregatingModel.LBNCI lbnci = new AggregatingModel.LBNCI();
    this.score = lbnci.calculateLBNCI(this.score, noOfOccurance, this.score);
}