@java.lang.Override
public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
    final int uidSize = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(uid.toByteArray()).length;
    final int gidSize = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(gid.toByteArray()).length;
    return new org.apache.commons.compress.archivers.zip.ZipShort(((3 + uidSize) + gidSize));
}