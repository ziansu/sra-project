public void sync(com.matburt.mobileorg.Parsing.MobileOrgApplication appInst) throws java.io.IOException {
    push(OrgFile.CAPTURE_FILE);
    pull(appInst);
}