@java.lang.Override
public void initAndValidate() throws java.lang.Exception {
    if ((uncertainInput.get()) != null) {
        uncertain = uncertainInput.get();
        if (uncertain)
            initProbabilities();
        
    }
}