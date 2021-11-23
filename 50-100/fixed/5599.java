public static void selectProductMinMaxSubmit(java.util.ArrayList<java.lang.Object> data) {
    model.product.Product product = ((model.product.Product) (data.get(0)));
    int min = ((int) (data.get(1)));
    int max = ((int) (data.get(2)));
    if (min > max)
        min = max;
    
    product.setMinStock(min);
    product.setMaxStock(max);
}