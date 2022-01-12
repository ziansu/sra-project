@java.lang.Override
public void writeLine(com.mendix.systemwideinterfaces.core.IMendixObject object) throws com.mendix.core.CoreException {
    try {
        java.lang.StringBuilder builder = this.getLineContent(object);
        this.writer.append(((builder.toString()) + (this.config.getLineEnd())));
    } catch (java.io.IOException e) {
        throw new com.mendix.core.CoreException(e);
    }
}