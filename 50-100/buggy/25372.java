@java.lang.Override
protected void readContent(com.github.zxh.classpy.luacout.LuacOutReader reader) {
    com.github.zxh.classpy.luacout.datatype.CInt size = new com.github.zxh.classpy.luacout.datatype.CInt();
    size.read(reader);
    super.add("size", size);
    for (int i = 0; i < (size.getValue()); i++) {
        com.github.zxh.classpy.luacout.LuacOutComponent c = componentSupplier.get();
        c.read(reader);
        super.add(null, c);
    }
}