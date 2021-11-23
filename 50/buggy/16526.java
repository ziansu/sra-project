@org.jetbrains.annotations.NotNull
@java.lang.Override
public java.lang.String getTargetFileNameWithExtension(java.lang.String fileName) {
    java.lang.String name = com.intellij.util.SystemProperties.getOsName();
    return fileName + ".exe";
}