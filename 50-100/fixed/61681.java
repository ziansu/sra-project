@java.lang.Override
public void visitMethodInsn(int opcode, java.lang.String owner, java.lang.String name, java.lang.String desc, boolean itf) {
    super.visitMethodInsn(opcode, owner, name, desc, itf);
    if (!(sanitize(ownerClass.getName()).equals(sanitize(owner)))) {
        com.sadboys.Models.UseModel usie = new com.sadboys.Models.UseModel(ownerClass.getName(), sanitize(owner));
        umlObjects.add(usie);
    }
}