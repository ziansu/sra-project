public void addClass(interfaces.IClass newClass) {
    java.lang.System.out.println(newClass.getName());
    if (!(classes.containsKey(newClass.getName())))
        classes.put(newClass.getName(), newClass);
    
}