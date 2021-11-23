@java.lang.Override
void select(java.util.List<java.lang.String> index, suneido.intfc.database.Record from, suneido.intfc.database.Record to) {
    suneido.util.Verify.verify(suneido.util.Util.startsWith(idx, index));
    sel.set(from, to);
    rewound = true;
}