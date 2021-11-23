@org.junit.Test
public void lowSpecificityShouldFollowHigherSpecificity() {
    subject = new uk.ac.ebi.atlas.model.experiment.differential.DifferentialProfileComparator(true, null, allContrasts, Regulation.UP);
    org.mockito.Mockito.when(profileMock1.getSpecificity(Regulation.UP)).thenReturn(1);
    org.mockito.Mockito.when(profileMock2.getSpecificity(Regulation.UP)).thenReturn(2);
    int comparison = subject.compare(profileMock1, profileMock2);
    org.hamcrest.MatcherAssert.assertThat(comparison, org.hamcrest.Matchers.lessThan(0));
}