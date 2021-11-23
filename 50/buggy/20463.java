@org.springframework.web.bind.annotation.RequestMapping(value = "/addVersion")
public void addVersionControl(@org.springframework.web.bind.annotation.RequestBody
com.dayuzl.coalapp.server.version.domain.VersionControl versionControl) {
    logger.info(("request param VersionControl: " + versionControl));
    versionControlService.saveNewVerion(versionControl);
}