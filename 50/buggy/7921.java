@java.lang.Override
public void resetParametersToInitialValues() {
    for (int i = 0; i < (effects.size); i++) {
        effects.get(i).resetParametersToInitialValues();
    }
}