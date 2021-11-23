public void invokeEvent(java.lang.String clazzName, java.lang.String methodName) {
    java.lang.System.out.println(("INVOKED CLASS : " + clazzName));
    java.lang.System.out.println(("INVOKED METHOD : " + methodName));
    queue.add(new org.test.byteinspector.model.MethodDefContainer(clazzName, methodName));
}