public java.lang.Integer getPatternID() {
    float rnd = ((float) (java.lang.Math.random()));
    float cumulativeProb = 0;
    int position = 0;
    for (java.lang.Float p : LLadlProbability) {
        cumulativeProb += p.floatValue();
        if (rnd < cumulativeProb) {
            return this.getLLadl().get(position);
        }
        position++;
    }
    return this.getLLadl().get(this.getLLadl().size());
}