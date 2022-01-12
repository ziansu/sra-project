public double getFitness() {
    double[] bin1 = this.getBinOne();
    double[] bin2 = this.getBinTwo();
    double score = this.getScore(bin1, bin2);
    if (score > 0) {
        return score;
    }else {
        return java.lang.Math.abs(score);
    }
}