@java.lang.Override
public java.io.File getParentFile() {
    return (parentFile) != null ? parentFile : (parentFile = net.filebot.util.FastFile.get(super.getParentFile()));
}