@org.junit.Test
public void higherAverageAcrossAllTissues() {
    subject = new uk.ac.ebi.atlas.model.experiment.baseline.BaselineProfileComparator(false, null, allOrganismParts, cutoff);
    int comparison = subject.compare(geneWithSpecificity1, geneWithSpecificity16);
    org.hamcrest.MatcherAssert.assertThat(comparison, org.hamcrest.CoreMatchers.is(org.hamcrest.Matchers.greaterThan(0)));
}