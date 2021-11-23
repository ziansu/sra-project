@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
@io.swagger.annotations.ApiOperation(value = "Get Category", notes = "Returns all the category")
public java.util.Collection<com.mangobazar.model.Category> Category() {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    org.springframework.security.core.userdetails.User user = ((org.springframework.security.core.userdetails.User) (auth.getPrincipal()));
    return categoryService.getAllCategory();
}