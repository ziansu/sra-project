@org.junit.Test
public void testMaxIntHash() {
    java.lang.String badKey = "'s_'s_not_noticed";
    assertEquals(java.lang.Integer.MIN_VALUE, badKey.hashCode());
    de.tudarmstadt.ukp.dkpro.core.api.frequency.util.FrequencyDistribution<java.lang.String> fd = new de.tudarmstadt.ukp.dkpro.core.api.frequency.util.FrequencyDistribution<java.lang.String>();
    fd.inc(badKey);
}