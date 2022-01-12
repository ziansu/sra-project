@java.lang.Override
public java.lang.String _stringValue(final msi.gama.runtime.IScope scope) throws msi.gama.runtime.exceptions.GamaRuntimeException {
    getContents(scope);
    final java.lang.StringBuilder sb = new java.lang.StringBuilder(((getBuffer().length(scope)) * 200));
    for (final msi.gama.util.IList<?> s : getBuffer().iterable(scope)) {
        sb.append(s).append("\n");
    }
    sb.setLength(((sb.length()) - 1));
    return sb.toString();
}