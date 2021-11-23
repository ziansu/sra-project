@java.lang.Override
public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
    java.util.List<org.scenarioo.example.e4.orders.search.OrderTableResult> tableResults = new java.util.ArrayList<org.scenarioo.example.e4.orders.search.OrderTableResult>();
    java.util.Set<org.scenarioo.example.e4.domain.Order> orders = orderService.searchForOrders(getOrderSearchInput());
    for (org.scenarioo.example.e4.domain.Order order : orders) {
        org.scenarioo.example.e4.orders.search.OrderTableResult tableResult = new org.scenarioo.example.e4.orders.search.OrderTableResult(order);
        tableResults.add(tableResult);
    }
    resultTableViewer.setInput(tableResults);
}