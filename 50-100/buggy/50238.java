@org.springframework.web.bind.annotation.RequestMapping(path = "/user-account", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getUserAccount(org.springframework.ui.Model model, javax.servlet.http.HttpSession session, com.theironyard.Entities.User user) {
    if ((session.getAttribute(com.theironyard.Controllers.NavigationController.CURRENT_USER)) == null) {
        return "redirect:/user-exception";
    }
    com.theironyard.Entities.User userId = userRepository.findFirstByUsername(((java.lang.String) (session.getAttribute(com.theironyard.Controllers.NavigationController.CURRENT_USER))));
    model.addAttribute("preferences", userId.getPreferredCoffee());
    return "user-account";
}