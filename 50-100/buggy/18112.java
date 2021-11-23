public static void chdir(org.python.core.PyObject path) {
    if (!(org.python.modules.posix.PosixModule.posix.stat(org.python.modules.posix.PosixModule.absolutePath(path)).isDirectory())) {
        throw org.python.core.Py.OSError(Errno.ENOTDIR, path);
    }
    if ((org.python.modules.posix.PosixModule.realpath) == null) {
        org.python.modules.posix.PosixModule.realpath = imp.load("os.path").__getattr__("realpath");
    }
    org.python.core.Py.getSystemState().setCurrentWorkingDir(org.python.modules.posix.PosixModule.realpath.__call__(path).asString());
}