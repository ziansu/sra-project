@java.lang.Override
public int compareTo(org.eclipse.php.composer.core.buildpath.BuildPathParser.BuildPathInfo o) {
    int c = path.compareTo(o.path);
    return c != 0 ? c : (type) - (o.type);
}