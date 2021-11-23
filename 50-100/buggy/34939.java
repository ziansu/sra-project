@java.lang.Override
public boolean init(final msi.gama.runtime.IScope scope) throws msi.gama.runtime.exceptions.GamaRuntimeException {
    boolean result = super.init(scope);
    if (!result) {
        return false;
    }
    createType();
    createFileName(scope);
    createRewrite();
    createHeader();
    createFooter();
    createExpression();
    return true;
}