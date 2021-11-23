@java.lang.Override
public void visit(org.swellrt.model.ReadableBoolean instance) {
    stack.push(parser.parse(instance.toString()));
}