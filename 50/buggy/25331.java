@java.lang.Override
public void initAndValidate() throws java.lang.Exception {
    if (((uncertainInput.get()) != null) && (uncertainInput.get())) {
        uncertain = true;
        initProbabilities();
    }
}