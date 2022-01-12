@org.junit.experimental.categories.Category(value = { eu.bittrade.libs.steemj.IntegrationTest.class })
@org.junit.Test
public void testOrderBook() throws java.lang.Exception {
    final eu.bittrade.libs.steemj.base.models.OrderBook orderBook = steemApiWrapper.getOrderBook(1);
    org.hamcrest.MatcherAssert.assertThat(orderBook.getAsks().size(), org.hamcrest.Matchers.equalTo(1));
    org.hamcrest.MatcherAssert.assertThat(orderBook.getBids().get(0).getSbd(), org.hamcrest.Matchers.greaterThan(1));
}