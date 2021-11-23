public void startComponentOperation(java.lang.String componentName) {
    final java.lang.String currentComponent = componentsStack.peek();
    if (componentName.equals(currentComponent))
        return ;
    
    componentsStack.push(componentName);
}