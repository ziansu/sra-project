public static java.lang.String getSaveLocationForFile(android.content.Context context, com.genonbeta.TrebleShot.helper.AwaitedFileReceiver receiver) {
    java.io.File tmpAddress = new java.io.File(receiver.fileAddress);
    return (tmpAddress.getParentFile()) == null ? com.genonbeta.TrebleShot.helper.FileUtils.getSaveLocationForFile(context, receiver.fileAddress) : tmpAddress.getParentFile().canWrite() ? receiver.fileAddress : com.genonbeta.TrebleShot.helper.FileUtils.getSaveLocationForFile(context, tmpAddress.getName());
}