@java.lang.Override
public void visit(mini_c.Lgoto o) {
    if (visited.contains(o.l)) {
        asm.jmp(o.l.toString());
    }
    lin(o.l);
}