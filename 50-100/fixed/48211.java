@java.lang.Override
public void model(final org.obicere.bytecode.core.objects.LocalVariable element, final org.obicere.bytecode.viewer.dom.DocumentBuilder builder) {
    final org.obicere.bytecode.core.objects.ConstantPool constantPool = builder.getConstantPool();
    final int descriptorIndex = element.getDescriptorIndex();
    final int nameIndex = element.getNameIndex();
    final java.lang.String descriptor = constantPool.getAsString(descriptorIndex);
    final java.lang.String name = constantPool.getAsString(nameIndex);
    final org.obicere.bytecode.core.objects.signature.FieldSignature signature = org.obicere.bytecode.core.objects.signature.FieldSignature.parse(descriptor);
    builder.model(signature);
    builder.add(" ");
    builder.add(name);
}