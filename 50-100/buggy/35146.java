@org.junit.Test
public void visitMainTask_TwoGlobalDefinedVariable_CorrectPythonScript() throws java.lang.Exception {
    java.lang.String a = ((((((((((((("" + (de.fhg.iais.roberta.syntax.codegen.AstToEv3PythonVisitorTest.IMPORTS)) + (de.fhg.iais.roberta.syntax.codegen.AstToEv3PythonVisitorTest.GLOBALS)) + "\nElement = 0\n") + "Element2 = 0\n") + "Element3 = \'none\'\n") + "def macheEtwas(x):\n") + "    Element3 = \'none\'\n\n") + "def macheEtwas2():\n") + "    Element = 0\n") + "    return Element2\n\n") + "def run():\n") + "    global Element, Element3\n") + "\n") + (de.fhg.iais.roberta.syntax.codegen.AstToEv3PythonVisitorTest.MAIN_METHOD);
    assertCodeIsOk(a, "/visitors/python_global_variables_check_two_used_variables.xml");
}