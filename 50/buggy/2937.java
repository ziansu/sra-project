@java.lang.Override
public void invokeObjects(java.lang.Object... objects) {
    this.product = ((module.product.model.Product) (objects[0]));
    loadData(product.getProductCode());
    java.lang.System.out.println(product.getProductCode());
}