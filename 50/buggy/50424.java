@java.lang.Override
public void execute(com.javaclasses.Result result) {
    result.getOperationStack().add(this.operation);
    result.setIndex(((result.getIndex()) + 1));
}