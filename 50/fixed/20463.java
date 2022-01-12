@org.springframework.web.bind.annotation.RequestMapping(value = "/addVersion")
public void addVersionControl() {
    com.dayuzl.coalapp.server.version.domain.VersionControl versionControl = new com.dayuzl.coalapp.server.version.domain.VersionControl();
    logger.info(("request param VersionControl: " + versionControl));
    versionControlService.saveNewVerion(versionControl);
}