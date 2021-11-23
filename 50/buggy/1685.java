public ontologizer.go.TermID[] getAlternatives() {
    ontologizer.go.TermID[] alts = new ontologizer.go.TermID[alternatives.size()];
    return alternatives.toArray(alts);
}