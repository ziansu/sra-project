@java.lang.Override
public boolean apply(org.apache.beam.sdk.util.ApiSurface.ClassPath.ClassInfo info) {
    return (info.className.indexOf('$')) == (-1);
}