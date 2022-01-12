@org.springframework.web.bind.annotation.RequestMapping(value = "/category/{id}/subcategory/{subId}/edit", produces = "text/html")
public java.lang.String categorySubEditForm(@org.springframework.web.bind.annotation.ModelAttribute(value = "form")
hu.unideb.inf.nvkshop.web.user.UserForm form, @org.springframework.web.bind.annotation.PathVariable(value = "id")
long id, @org.springframework.web.bind.annotation.PathVariable(value = "subId")
long subId, org.springframework.ui.Model model, org.springframework.web.servlet.mvc.support.RedirectAttributes redAttrs) {
    hu.unideb.inf.nvkshop.web.admin.CategoryForm categoryForm = new hu.unideb.inf.nvkshop.web.admin.CategoryForm();
    hu.unideb.inf.rft.nvkshop.entities.product.Category cat = categoryService.findById(subId);
    if (cat == null) {
        return "redirect:/admin/categories";
    }
    categoryForm.setCategory(cat);
    model.addAttribute("form", form);
    return "admin/subcategory";
}