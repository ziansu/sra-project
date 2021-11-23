@com.codeup.controller.PostMapping(value = "/list/create")
public java.lang.String saveList(@com.codeup.controller.RequestParam(value = "name")
java.lang.String name) {
    com.codeup.controller.User user = ((com.codeup.controller.User) (org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getPrincipal()));
    com.codeup.controller.GroceryList glist = groceryListsRepository.save(new com.codeup.controller.GroceryList(name));
    userGListRepository.save(new com.codeup.controller.UserGList(glist, user));
    return "redirect:/lists";
}