public void invokeEvent(java.lang.String clazzName, java.lang.String methodName) {
    queue.add(new org.test.byteinspector.model.MethodDefContainer(clazzName, methodName));
}