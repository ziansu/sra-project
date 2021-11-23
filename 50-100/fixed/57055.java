@org.junit.Test
public void lowSpecificityShouldFollowHigherSpecificity() {
    subject = new uk.ac.ebi.atlas.model.experiment.baseline.BaselineProfileComparator(true, allOrganismParts, allOrganismParts, cutoff);
    int comparison = subject.compare(geneWithSpecificity16, geneWithSpecificity1);
    org.hamcrest.MatcherAssert.assertThat(comparison, org.hamcrest.CoreMatchers.is(org.hamcrest.Matchers.greaterThan(0)));
}