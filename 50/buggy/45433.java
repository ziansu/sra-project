@org.python.modules.posix.Hide(value = OS.NT)
public static java.lang.String readlink(org.python.core.PyObject path) {
    try {
        return org.python.modules.posix.PosixModule.posix.readlink(org.python.modules.posix.PosixModule.absolutePath(path));
    } catch (java.io.IOException ioe) {
        throw org.python.core.Py.OSError(ioe);
    }
}