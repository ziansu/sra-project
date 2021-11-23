@java.lang.Override
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String displayHomePage() {
    fr.flop.songmanager.controller.impl.HomeControllerImpl.LOGGER.info("test");
    java.lang.System.out.println("test");
    return "index";
}