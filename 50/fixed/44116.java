@java.lang.Override
public boolean accept(java.io.File dir, java.lang.String name) {
    return (!(name.endsWith(endsWith))) && (!(name.equals("instant-run")));
}