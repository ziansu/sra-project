@java.lang.Override
public void visit(org.kframework.backend.java.kil.JavaSymbolicObject term) {
    set = setStack.pop();
    set.addAll(intermediate.get(term));
    setValue.accept(intermediate.get(term), term);
    intermediate.remove(term);
}