@org.springframework.web.bind.annotation.RequestMapping(value = tran.example.presentation.controller.AddPostController.ADD_POST_MAPPING, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String displayAddForm(java.security.Principal principal, org.springframework.ui.ModelMap model, org.springframework.web.servlet.mvc.support.RedirectAttributes requestAttributes) {
    return addPostControllerService.displayAddForm(principal, model, requestAttributes);
}