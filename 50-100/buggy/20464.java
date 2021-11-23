final void recalculate() {
    _score = (java.lang.Integer.MIN_VALUE) + 1;
    _minEditDistance = ((byte) (INDEX_LENGTH));
    for (final com.fulcrumgenomics.util.PickIlluminaIndicesCommand.Index that : this.related) {
        final byte distance = calculateEditDistance(that);
        _score += com.fulcrumgenomics.util.PickIlluminaIndicesCommand.SCORE_BY_DISTANCE[distance];
        if (distance < (_minEditDistance))
            _minEditDistance = distance;
        
    }
}