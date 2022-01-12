@java.lang.Override
public Abstract.Expression makeDefCall(com.jetbrains.jetpad.vclang.term.Abstract.Expression expr, com.jetbrains.jetpad.vclang.term.Abstract.Definition definition) {
    return cDefCall(((com.jetbrains.jetpad.vclang.frontend.Concrete.Expression) (expr)), definition, (definition == null ? "\\this" : definition.getName()));
}