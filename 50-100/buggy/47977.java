@org.springframework.web.bind.annotation.RequestMapping(value = "picture/{registerId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String show(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long registerId, org.springframework.ui.Model uiModel) {
    log.info("show() registerId={}", registerId);
    org.jugbd.mnet.domain.Register register = registerService.findOne(registerId);
    org.jugbd.mnet.domain.PictureInformation pictureInformation = register.getPictureInformation();
    if (pictureInformation != null) {
        uiModel.addAttribute("pictureInformation", pictureInformation);
    }
    uiModel.addAttribute("register", register);
    return "picture/show";
}