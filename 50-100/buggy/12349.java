@java.lang.Override
public boolean accept(java.io.File dir, java.lang.String name) {
    return (!(name.equals("instant-run"))) && (!(((name.endsWith(".json")) && (name.startsWith("horaris_"))) && (name.endsWith(endsWith))));
}