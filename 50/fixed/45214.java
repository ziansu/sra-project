@org.junit.Test
public void returnsEmptyMapOnGetAllScenariosWhenThereAreNone() {
    org.junit.Assert.assertThat(getAllScenarios().size(), is(0));
}