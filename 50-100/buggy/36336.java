@java.lang.Override
public void run() {
    try {
        svm.svm_set_print_string_function(new libsvm.core.libsvm.svm_print_interface() {
            @java.lang.Override
            public void print(java.lang.String s) {
            }
        });
        long t1 = java.lang.System.currentTimeMillis();
        result = svm.svm_train(problem, parameter);
        long t2 = java.lang.System.currentTimeMillis();
        java.lang.System.out.println(("time for training once: " + (t2 - t1)));
    } catch (libsvm.extension.SVMTimeOutException e) {
        e.printStackTrace();
        result = null;
    }
}