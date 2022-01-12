@java.lang.Override
public void addViewControllers(ru.kadyrov.electron.commerce.config.ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("index");
    registry.addViewController("/products/list").setViewName("fragments :: listProduct");
    registry.addViewController("/products/add").setViewName("fragments :: addProduct");
    registry.addViewController("/products/product").setViewName("fragments :: product");
    registry.addViewController("/products/shoppingCart").setViewName("fragments :: shoppingCart");
    registry.addViewController("/orders/load").setViewName("fragments :: orders");
    registry.addViewController("/orders/order").setViewName("fragments :: order");
    super.addViewControllers(registry);
}