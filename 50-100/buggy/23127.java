@java.lang.Override
public void applyTo(operations.OperationApplier d) {
    try {
        d.remove(start, ((end) - (start)));
    } catch (java.lang.Exception ex) {
        java.lang.System.err.println(((((((("Could not apply DelOperation to OperationApplier:\nOperationApplier is " + (d.getText().length())) + " chars long\nOperation deletes ") + ((end) - (start))) + " chars from ") + (start)) + "\n") + ex));
    }
}