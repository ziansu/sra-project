@java.lang.Override
public boolean apply(com.oracle.graal.nodes.graphbuilderconf.GraphBuilderContext b, jdk.vm.ci.meta.ResolvedJavaMethod targetMethod, com.oracle.graal.nodes.graphbuilderconf.InvocationPlugin.Receiver receiver, com.oracle.graal.nodes.ValueNode value) {
    b.push(JavaKind.Double, b.recursiveAppend(new com.oracle.graal.nodes.calc.AbsNode(value).canonical(null)));
    return true;
}