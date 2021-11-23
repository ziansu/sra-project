private void create(net.minecraft.util.ResourceLocation l, java.lang.Exception e) throws java.io.IOException {
    java.io.File f = new java.io.File(((("missingAssets/" + (l.getResourceDomain())) + "/") + (l.getResourcePath())));
    f.getParentFile().mkdirs();
    f.createNewFile();
    java.io.PrintStream ps = new java.io.PrintStream(f);
    e.printStackTrace(ps);
    ps.close();
    java.lang.System.out.println(("Missing file: " + (f.getAbsolutePath())));
}