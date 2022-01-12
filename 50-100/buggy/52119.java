public void accept(com.googlecode.d2j.visitors.DexAnnotationAble av) {
    com.googlecode.d2j.visitors.DexAnnotationVisitor av1 = av.visitAnnotation(type, visibility);
    if (av != null) {
        for (com.googlecode.d2j.node.DexAnnotationNode.Item item : items) {
            com.googlecode.d2j.node.DexAnnotationNode.acceptAnnotationItem(av1, item.name, item.value);
        }
        av1.visitEnd();
    }
}