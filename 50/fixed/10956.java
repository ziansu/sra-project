@org.junit.Test
public void findOrders() {
    io.oasp.module.jpa.common.api.to.PaginatedListTo<io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderCto> orders = this.helper.getService().findOrders(null);
    assertThat(orders).isNotNull();
    assertThat(orders).isNotNull();
}