@org.springframework.web.bind.annotation.RequestMapping(value = org.openhubframework.openhub.admin.web.changes.ChangesController.CHANGES_URI, method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.TEXT_PLAIN_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getChangesContent() throws java.io.IOException {
    java.lang.String resStr = "";
    java.util.List<java.lang.String> lines = org.apache.commons.io.IOUtils.readLines(changelogProvider.getChangelog().getInputStream(), java.nio.charset.StandardCharsets.UTF_8);
    for (java.lang.String line : lines) {
        resStr += line;
        resStr += "\n";
    }
    return resStr;
}