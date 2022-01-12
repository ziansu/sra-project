@java.lang.Override
public int compare(eu.interedition.collatex.Token base, eu.interedition.collatex.Token witness) {
    final java.lang.String baseContent = ((eu.interedition.collatex.simple.SimpleToken) (base)).getNormalized();
    final java.lang.String witnessContent = ((eu.interedition.collatex.simple.SimpleToken) (witness)).getNormalized();
    return (eu.interedition.collatex.matching.EditDistance.compute(baseContent, witnessContent)) <= (threshold) ? 0 : -1;
}