public static synchronized void init(android.content.Context context) {
    com.tcl.gc.popgrid.util.Db4oUtil.ctx = context;
    com.db4o.config.EmbeddedConfiguration config = com.db4o.Db4oEmbedded.newConfiguration();
    config.common().objectClass(com.tcl.gc.popgrid.util.Db4oUtil.Kv.class).objectField("k").indexed(true);
    if (((com.tcl.gc.popgrid.util.Db4oUtil.db) == null) || (com.tcl.gc.popgrid.util.Db4oUtil.db.ext().isClosed())) {
        com.tcl.gc.popgrid.util.Db4oUtil.db = com.db4o.Db4oEmbedded.openFile(config, (((android.os.Environment.getExternalStorageDirectory()) + "/") + (com.tcl.gc.popgrid.util.Db4oUtil.DB_NAME)));
    }
}