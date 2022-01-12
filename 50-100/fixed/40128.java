@java.lang.Override
public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
    byte[] b = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(uid.toByteArray());
    final int uidSize = (b == null) ? 0 : b.length;
    b = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(gid.toByteArray());
    final int gidSize = (b == null) ? 0 : b.length;
    return new org.apache.commons.compress.archivers.zip.ZipShort(((3 + uidSize) + gidSize));
}