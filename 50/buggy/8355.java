@java.lang.Override
public void setup(final org.apache.drill.exec.ops.OperatorContext context, final org.apache.drill.exec.physical.impl.OutputMutator output) throws org.apache.drill.common.exceptions.ExecutionSetupException {
    this.output = output;
    this.context = context;
}