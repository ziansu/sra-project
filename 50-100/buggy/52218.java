@org.jetbrains.annotations.NotNull
private static com.intellij.structure.impl.domain.IdeVersion readBuildNumber(@org.jetbrains.annotations.NotNull
java.io.File versionFile) throws java.io.IOException {
    java.lang.String buildNumberString = com.google.common.io.Files.toString(versionFile, java.nio.charset.Charset.defaultCharset()).trim();
    java.util.regex.Matcher matcher = com.intellij.structure.impl.domain.IdeaManager.BUILD_NUMBER_PATTERN.matcher(buildNumberString);
    if (matcher.matches()) {
        return com.intellij.structure.impl.domain.IdeVersion.createIdeVersion(matcher.group(1));
    }
    return com.intellij.structure.impl.domain.IdeVersion.getDefaultVersion();
}