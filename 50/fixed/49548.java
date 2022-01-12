@java.lang.Override
public void saveTransformation() {
    transformationStack.add(transform.createClone());
}