@org.springframework.web.bind.annotation.RequestMapping(value = "/validate")
public AuthService.servlet.Model.Validate.Validate validate(@org.springframework.web.bind.annotation.RequestParam(value = "sessionid")
java.lang.String sessionid) {
    for (AuthService.servlet.Model.Entites.ProfileCache pc : profileCacheRepository.findAll()) {
        if ((pc.getSessionid()) != null) {
            if (pc.getSessionid().equals(sessionid)) {
                return new AuthService.servlet.Model.Validate.Validate(true, pc.getProfile_id().toString());
            }
        }
    }
    return new AuthService.servlet.Model.Validate.Validate();
}