public boolean isSuper(javassist.CtBehavior behavior, int pos) {
    javassist.bytecode.CodeIterator codeIter = behavior.getMethodInfo().getCodeAttribute().iterator();
    return ((codeIter.byteAt(pos)) == (javassist.bytecode.Opcode.INVOKESPECIAL)) && (!(behavior.getDeclaringClass().getName().equals(getClassName(codeIter, pos))));
}