public void testModel1() {
    model.CategoryPage multiIOCat = new model.CategoryPage(driver, this.products);
    multiIOCat.setUrl(CatUrl);
    multiIOCat.LoadPage();
    java.lang.System.out.println(multiIOCat.getInitLoadTime());
    multiIOCat.selectProduct("C Series Multifunction I/O Module");
    java.lang.System.out.println(multiIOCat.getProducts().get("C Series Multifunction I/O Module").getInitLoadTime());
}