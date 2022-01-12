@org.junit.Test
public void parseSimpleTableWithSimgleColumn() {
    fitnesse.idea.rt.TableFormatter tableFormatter = new fitnesse.idea.rt.TableFormatter(java.util.Arrays.asList(java.util.Arrays.asList(6), java.util.Arrays.asList(10)));
    org.junit.Assert.assertThat(tableFormatter.rightPadding(0, 0), org.hamcrest.CoreMatchers.is((10 - 6)));
    org.junit.Assert.assertThat(tableFormatter.rightPadding(1, 0), org.hamcrest.CoreMatchers.is(0));
}