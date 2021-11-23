private void setClassListMap(listener.ITestContext tc) {
    synchronized(listener.WebDriverListener.classListMap) {
        for (listener.ITestNGMethod m : tc.getAllTestMethods()) {
            java.lang.Class methodsClass = m.getRealClass();
            java.util.List<listener.ITestNGMethod> methods = listener.WebDriverListener.classListMap.get(methodsClass);
            if (methods == null) {
                methods = new java.util.ArrayList<listener.ITestNGMethod>();
            }
            methods.add(m);
            listener.WebDriverListener.classListMap.put(methodsClass, methods);
        }
    }
}