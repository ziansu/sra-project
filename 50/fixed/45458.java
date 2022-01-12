@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_ADMIN')")
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
@io.swagger.annotations.ApiOperation(value = "Get Category", notes = "Returns all the category")
public java.util.Collection<com.mangobazar.model.Category> Category() {
    return categoryService.getAllCategory();
}