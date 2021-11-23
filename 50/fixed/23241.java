public static java.nio.file.FileSystem get() {
    if ((net.serenitybdd.core.photography.DarkroomFileSystem.fileSystemThreadLocal.get()) == null) {
        net.serenitybdd.core.photography.DarkroomFileSystem.fileSystemThreadLocal.set(com.google.common.jimfs.Jimfs.newFileSystem(com.google.common.jimfs.Configuration.unix()));
    }
    return net.serenitybdd.core.photography.DarkroomFileSystem.fileSystemThreadLocal.get();
}