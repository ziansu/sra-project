private org.python.core.PyObject importRunnerClass() {
    org.python.util.PythonInterpreter interpreter = new org.python.util.PythonInterpreter();
    interpreter.exec("import robot; from robot.jarrunner import JarRunner");
    return interpreter.get("JarRunner");
}