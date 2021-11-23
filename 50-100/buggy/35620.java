public void writeToStream(java.io.OutputStream os) throws java.lang.Exception {
    if (os == null)
        return ;
    
    java.io.DataOutputStream wr = new java.io.DataOutputStream(os);
    wr.writeInt(me.enerccio.sp.compiler.ModuleDefinition.pycHeader);
    wr.writeInt(me.enerccio.sp.compiler.ModuleDefinition.version);
    wr.write(me.enerccio.sp.compiler.BlockDefinition.asBytes(root, me.enerccio.sp.compiler.ModuleDefinition.version));
    os.close();
}