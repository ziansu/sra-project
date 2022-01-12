@org.springframework.web.bind.annotation.RequestMapping(value = "/removeCategories")
public java.lang.String removeCategory(@org.springframework.web.bind.annotation.RequestParam(value = "rmcategory")
java.lang.String nombre, javax.servlet.http.HttpSession session, org.springframework.ui.Model model) {
    asw.dbUpdate.model.Category category = categoryService.getCategoryByName(nombre);
    if (category != null) {
        categoryService.deleteCategory(category);
    }
    java.util.List<asw.dbUpdate.model.Suggestion> sugerencias = suggestionService.getAllSuggestions();
    model.addAttribute("sugerencias", sugerencias);
    return "config";
}