@java.lang.Override
public void visitLineNumber(int line, org.objectweb.asm.Label start) {
    currentLine = line;
    currentIndex = 0;
}