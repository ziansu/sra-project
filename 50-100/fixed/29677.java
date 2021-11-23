@org.springframework.web.bind.annotation.RequestMapping(value = "/logout")
public AuthService.servlet.Model.Logout.Logout logout(@org.springframework.web.bind.annotation.RequestParam(value = "sessionid")
java.lang.String sessionid) {
    for (AuthService.servlet.Model.Entites.ProfileCache pc : profileCacheRepository.findAll()) {
        if ((pc.getSessionid()) != null) {
            if (pc.getSessionid().equals(sessionid)) {
                pc.setSessionid("");
                profileCacheRepository.save(pc);
                return new AuthService.servlet.Model.Logout.Logout(true);
            }
        }
    }
    return new AuthService.servlet.Model.Logout.Logout(false);
}