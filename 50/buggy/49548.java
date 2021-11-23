@java.lang.Override
public void saveTransformation() {
    context.save();
    transformationStack.add(transform.createClone());
}