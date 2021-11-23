public void startComponentOperation(java.lang.String componentName) {
    final java.lang.String currentComponent = componentsStack.peek();
    if (currentComponent.equals(componentName))
        return ;
    
    componentsStack.push(componentName);
}