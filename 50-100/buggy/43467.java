@java.lang.Override
public boolean canRunAction() throws java.io.IOException, java.lang.IllegalAccessException, java.net.URISyntaxException {
    if (config.disableJira) {
        log.warn("Jira is disabled by config property disableJira");
        return false;
    }
    if (draft.hasBugNumber(config.noBugNumberLabel)) {
        return true;
    }
    log.info("Skipping action {} as the commit has no bug number", this.getClass().getSimpleName());
    return super.canRunAction();
}