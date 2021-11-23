@org.junit.Test
public void aDeadCellShouldBeRepresentedByADot() {
    com.wakaleo.gameoflife.domain.Cell cell = com.wakaleo.gameoflife.domain.Cell.fromSymbol(".");
    org.hamcrest.MatcherAssert.assertThat(cell, org.hamcrest.Matchers.is(com.wakaleo.gameoflife.domain.Cell.DEAD_CELL));
    assertTrue(true);
}