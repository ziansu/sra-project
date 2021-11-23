public org.magic.console.Command commandFactory(java.lang.String name) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.lang.String clazz = (java.lang.Character.toUpperCase(name.charAt(0))) + (name.substring(1));
    java.lang.Class myCommand = classLoader.loadClass(("org.magic.console.commands." + clazz));
    org.magic.console.Command c = ((org.magic.console.Command) (myCommand.newInstance()));
    return c;
}