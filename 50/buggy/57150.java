@java.lang.Override
public void onTextAvailable(com.intellij.execution.process.ProcessEvent event, com.intellij.openapi.util.Key key) {
    if (ProcessOutputTypes.STDERR.equals(key)) {
        java.lang.System.err.print(event.getText());
    }else {
        java.lang.System.out.print(event.getText());
    }
}