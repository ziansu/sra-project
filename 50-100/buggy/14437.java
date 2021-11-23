@org.springframework.web.bind.annotation.RequestMapping(value = "/removeCategory")
public java.lang.String removeCategory(@org.springframework.web.bind.annotation.RequestParam(value = "rmcategory")
java.lang.String nombre, javax.servlet.http.HttpSession session, org.springframework.ui.Model model) {
    asw.dbUpdate.model.Category category = categoryService.getCategoryByName(nombre);
    if (category != null) {
        asw.dbUpdate.model.Category categoria = new asw.dbUpdate.model.Category(nombre);
        categoryService.deleteCategory(categoria);
    }
    java.util.List<asw.dbUpdate.model.Suggestion> sugerencias = suggestionService.getAllSuggestions();
    model.addAttribute("sugerencias", sugerencias);
    return "config";
}