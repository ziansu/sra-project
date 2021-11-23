@org.junit.Test
public final void export() {
    final org.basex.core.IOFile io = new org.basex.core.IOFile(org.basex.core.CommandTest.FN);
    org.basex.core.CommandTest.no(new org.basex.core.Export(io.path()));
    org.basex.core.CommandTest.ok(new org.basex.core.CreateDB(NAME, org.basex.core.CommandTest.FILE));
    org.basex.core.CommandTest.ok(new org.basex.core.Export("."));
    org.basex.core.CommandTest.ok(io.exists());
    org.basex.core.CommandTest.ok(io.delete());
}