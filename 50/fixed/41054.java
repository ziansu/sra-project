@java.lang.Override
public boolean matches(final java.lang.Object[] args, final som.interpreter.nodes.ExpressionNode[] argNodes) {
    if (args == null) {
        return true;
    }
    return (!(som.VmSettings.DYNAMIC_METRICS)) && ((args[0]) == (som.vm.constants.Classes.valueArrayClass));
}