@org.springframework.web.bind.annotation.RequestMapping(value = "/api/is-signed-in", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
hu.bme.msc.agiletool.model.User isSignedIn(java.security.Principal principal) {
    return userRepository.findByUsername(principal.getName());
}