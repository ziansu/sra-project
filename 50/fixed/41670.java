@com.webshop.controller.RequestMapping(value = "categories/add", method = RequestMethod.POST)
@com.webshop.controller.ResponseBody
public void addCategory(@com.webshop.controller.ModelAttribute(value = "category")
com.webshop.model.product.Category category) {
    if (!(category.getCategoryName().isEmpty()))
        categoryService.saveCategory(category);
    
}