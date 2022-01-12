private java.lang.String parseGitVersion(java.lang.String hgOut) {
    java.lang.String[] lines = hgOut.split("\n");
    java.lang.String firstLine = lines[0];
    java.util.regex.Matcher m = com.thoughtworks.go.config.materials.git.GitMaterial.GIT_VERSION_PATTERN.matcher(firstLine);
    if (m.matches()) {
        return m.group(1);
    }else {
        throw bomb(("can not parse hgout : " + hgOut));
    }
}