@org.junit.Test
public void resultShouldHaveTheCorrectSize() {
    final int CAPACITY = 25;
    final int SIZE = 10000;
    eu.diversify.trio.core.requirements.Requirement requirement = buildRequirement(CAPACITY, SIZE);
    eu.diversify.trio.core.requirements.stats.LeafCount leafCount = leafCount(requirement);
    assertThat(leafCount.get(), is(equalTo(SIZE)));
}