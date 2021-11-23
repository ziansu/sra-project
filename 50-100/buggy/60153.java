public void estimateLabelAddress() {
    int pos = 0;
    for (me.wener.bbvm.asm.Assembly assembly : assemblies) {
        if ((assembly.getType()) == (Assembly.Type.LABEL)) {
            ((me.wener.bbvm.asm.Label) (assembly)).setValue(pos);
        }else {
            pos += assembly.length();
        }
    }
}