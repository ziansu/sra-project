public java.lang.String displayAddForm(java.security.Principal principal, org.springframework.ui.ModelMap model) {
    if (principal != null) {
        java.lang.String userName = principal.getName();
        if (userName != null) {
            model.addAttribute(tran.example.service.AddPostControllerService.LOGGED_IN_NAME_KEY, userName);
            return tran.example.service.AddPostControllerService.ADD_POST_PAGE;
        }else {
            model.addAttribute(tran.example.service.AddPostControllerService.MESSAGE_KEY, tran.example.service.AddPostControllerService.NOT_LOGGED_IN_ERROR_MESSAGE);
            return tran.example.service.AddPostControllerService.SIGNIN_PAGE;
        }
    }else {
        model.addAttribute(tran.example.service.AddPostControllerService.MESSAGE_KEY, tran.example.service.AddPostControllerService.NOT_LOGGED_IN_ERROR_MESSAGE);
        return tran.example.service.AddPostControllerService.SIGNIN_PAGE;
    }
}