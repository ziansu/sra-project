@java.lang.Override
public void check(dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context) {
    this.type.check(markers, context);
    if ((this.value) != null) {
        this.value.check(markers, context);
    }
}