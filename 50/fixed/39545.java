@java.lang.Override
public long read(long fd, long buf, int len, long offset) {
    return fail ? -1 : super.read(fd, buf, len, offset);
}