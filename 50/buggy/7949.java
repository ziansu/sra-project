@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/")
public io.angelhack.rest.pojo.response.UserInformation getInfo() {
    io.angelhack.rest.pojo.response.UserInformation userInformation = ((io.hackangel.street.cleaner.security.UserDetails) (org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getDetails())).getUserInformation();
    return userInformation;
}