@java.lang.Override
public java.lang.String translateToString() throws prism.PrismException {
    java.lang.String prismModelString = null;
    try {
        prismModelString = pepa.compiler.Main.compile(("" + (modelFile)));
    } catch (prism.pepa e) {
        throw new prism.PrismException(("Could not import PEPA model:\n" + (e.getMessage())));
    }
    return prismModelString;
}