@java.lang.Override
public void run() {
    if (!(parentStatement.didRun())) {
        returnType = script.getLogic().run(line, this);
    }
}