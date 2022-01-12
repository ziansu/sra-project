@org.springframework.web.bind.annotation.RequestMapping(value = tran.example.presentation.controller.AddPostController.PROCESS_ADD_POST_MAPPING, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String processAddForm(@org.springframework.web.bind.annotation.RequestParam(value = tran.example.presentation.controller.AddPostController.TITLE_PARAM, required = false)
java.lang.String title, @org.springframework.web.bind.annotation.RequestParam(value = tran.example.presentation.controller.AddPostController.CONTENT_PARAM, required = false)
java.lang.String content, java.security.Principal principal, org.springframework.ui.ModelMap model) {
    return addPostControllerService.processAddForm(title, content, principal, model);
}