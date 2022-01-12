@java.lang.Override
public JS visit(org.stjs.generator.writer.WriterVisitor<JS> visitor, com.sun.source.tree.MemberSelectTree tree, org.stjs.generator.GenerationContext<JS> context) {
    java.lang.String templateName = buildTemplateName(tree, context);
    return visitor.forward(org.stjs.generator.visitor.DiscriminatorKey.of(org.stjs.generator.writer.expression.MemberSelectWriter.class.getSimpleName(), templateName), tree, context);
}