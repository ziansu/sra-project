@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String submitSearch(javax.servlet.http.HttpServletRequest request, org.springframework.ui.Model model) {
    searchController = new teymi15.kassistant.control.SearchController();
    java.lang.String search = request.getParameter("search");
    teymi15.kassistant.control.œ results = searchController.searchRecipeByName(search);
    model.addAttribute("recipeList", results);
    return "resultpage";
}