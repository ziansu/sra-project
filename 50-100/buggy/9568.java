@org.springframework.web.bind.annotation.RequestMapping(path = "/catalogue", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView printCatalogue() {
    com.springapp.dao.ProductCatalogueDao productCatalogueDao = new com.springapp.dao.ProductCatalogueDaoImp();
    java.util.List<com.springapp.model.Product> list = productCatalogueDao.getAllProducts();
    com.springapp.model.ProductCatalogue.getProductCatalogue().addListOfProducts(list);
    com.springapp.model.ProductCatalogue.getProductCatalogue().removeAllProducts();
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView("show_all");
    model.addObject("products", com.springapp.model.ProductCatalogue.getProductCatalogue().getProducts());
    return model;
}