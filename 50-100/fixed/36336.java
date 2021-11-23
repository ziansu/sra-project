@java.lang.Override
public void run() {
    try {
        svm.svm_set_print_string_function(new libsvm.core.libsvm.svm_print_interface() {
            @java.lang.Override
            public void print(java.lang.String s) {
            }
        });
        result = svm.svm_train(problem, parameter);
    } catch (libsvm.extension.SVMTimeOutException e) {
        e.printStackTrace();
        result = null;
    }
}