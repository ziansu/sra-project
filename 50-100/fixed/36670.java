public void setClassname(java.lang.String classname) {
    if ((executableType) == (org.apache.tools.ant.types.CommandlineJava.ExecutableType.MODULE)) {
        javaCommand.setExecutable(org.apache.tools.ant.types.CommandlineJava.createModuleClassPair(org.apache.tools.ant.types.CommandlineJava.parseModuleFromModuleClassPair(javaCommand.getExecutable()), classname), false);
    }else {
        javaCommand.setExecutable(classname);
        executableType = org.apache.tools.ant.types.CommandlineJava.ExecutableType.CLASS;
    }
}