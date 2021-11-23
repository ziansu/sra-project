public boolean isSuper(javassist.CtBehavior behavior, int pos) {
    javassist.bytecode.CodeIterator codeIter = behavior.getMethodInfo().getCodeAttribute().iterator();
    java.lang.String s = getClassName(codeIter, pos);
    return ((codeIter.byteAt(pos)) == (javassist.bytecode.Opcode.INVOKESPECIAL)) && (!(behavior.getDeclaringClass().getName().equals(getClassName(codeIter, pos))));
}