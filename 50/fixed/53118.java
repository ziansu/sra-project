@java.lang.Override
public void appendSignature(java.lang.StringBuilder builder) {
    for (int i = 0; i < (this.parameterCount); i++) {
        this.parameters[i].getType().appendSignature(builder, false);
    }
}