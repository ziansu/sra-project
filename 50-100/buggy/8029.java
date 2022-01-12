public static void addTable(br.com.mvbos.mymer.el.TableElement te, java.lang.StringBuilder sb) {
    br.com.mvbos.mymer.sync.Differ.entityToScript.setMode(IEntityToScript.Mode.PLAIN);
    br.com.mvbos.mymer.sync.Differ.entityToScript.addTable(te, sb);
    short ct = 1;
    for (br.com.mvbos.mymer.xml.field.Field f : te.getFields()) {
        br.com.mvbos.mymer.sync.Differ.entityToScript.addField(te, f, (ct++), sb);
    }
}