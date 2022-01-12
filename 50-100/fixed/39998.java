@java.lang.Override
public void run() throws java.lang.Exception {
    java.lang.System.out.println((("Start test[" + (getScriptName())) + "]..."));
    java.lang.String res;
    for (com.duansky.benchmark.flink.test.components.GraphTemplate template : templates) {
        res = runInternal(template);
        if (res != null) {
            java.lang.System.out.println(res);
            writeResult(res);
        }else {
            java.lang.System.out.println("the result is null");
        }
    }
}