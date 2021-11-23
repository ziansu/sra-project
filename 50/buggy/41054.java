@java.lang.Override
public boolean matches(final java.lang.Object[] args, final som.interpreter.nodes.ExpressionNode[] argNodes) {
    return (!(som.VmSettings.DYNAMIC_METRICS)) && ((args[0]) == (som.vm.constants.Classes.valueArrayClass));
}