@org.junit.Test
public void getTotalSequencesIterated() throws java.lang.Exception {
    randoop.generation.exhaustive.SequenceGenerator<java.lang.String> sgenLarger = new randoop.generation.exhaustive.SequenceGenerator(largerSet);
    long beforeIterateLarger = sgenLarger.getTotalSequencesIterated().longValue();
    int numberOfSequencesToGenerate = 13;
    for (int i = 0; i < numberOfSequencesToGenerate; i++) {
        sgenLarger.next();
    }
    org.junit.Assert.assertEquals(0, beforeIterateLarger);
    org.junit.Assert.assertEquals(numberOfSequencesToGenerate, sgenLarger.getTotalSequencesIterated().intValue());
}