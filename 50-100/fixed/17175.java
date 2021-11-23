@org.springframework.web.bind.annotation.RequestMapping(value = "/profile", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String loadProfilePage(org.springframework.ui.ModelMap model, javax.servlet.http.HttpServletRequest request) {
    javax.servlet.http.HttpSession session = request.getSession();
    com.wh.db.transfer.User user = ((com.wh.db.transfer.User) (session.getAttribute(Beans.USER)));
    if (user == null) {
        return "redirect:/expired";
    }else {
        return com.wh.constants.Pages.PROFILE_PAGE;
    }
}