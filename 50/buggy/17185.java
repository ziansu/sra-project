@java.lang.Override
public void check(dyvil.tools.parsing.position.ICodePosition position, dyvil.tools.parsing.marker.MarkerList markers) {
    dyvil.tools.compiler.ast.reference.StaticFieldReference.map.clear();
    dyvil.tools.compiler.ast.reference.InstanceFieldReference.checkFinalAccess(field, position, markers);
}