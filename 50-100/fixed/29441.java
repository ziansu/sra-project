@java.lang.SuppressWarnings(value = "unchecked")
private lu.nowina.nexu.api.flow.OperationResult<lu.nowina.nexu.api.Product> handleMatch(final lu.nowina.nexu.api.ProductAdapter productAdapter, final lu.nowina.nexu.api.Product product) {
    final java.net.URL url = productAdapter.getFXMLConfigurationURL(product);
    if (url != null) {
        return operationFactory.getOperation(lu.nowina.nexu.view.core.UIOperation.class, url, product).perform();
    }else {
        return new lu.nowina.nexu.api.flow.OperationResult<lu.nowina.nexu.api.Product>(product);
    }
}