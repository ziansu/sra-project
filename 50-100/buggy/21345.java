public void orderService(org.springframework.ui.Model model, java.lang.Integer categoryId) {
    this.categoryId = categoryId;
    java.lang.String categoryName = (categoryId == null) ? jtelecom.controller.user.ServiceOrderController.ALL_CATEGORIES : productDAO.getProductCategoryById(categoryId).getCategoryName();
    model.addAttribute("categoryName", categoryName);
    java.util.List<jtelecom.dao.product.ProductCategories> productCategories = productDAO.getProductCategories();
    model.addAttribute("productsCategories", productCategories);
}