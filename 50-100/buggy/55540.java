@org.junit.Test
public void visitMainTask_OneGlobalDefinedVariable_CorrectPythonScript() throws java.lang.Exception {
    java.lang.String a = (((((((((("" + (de.fhg.iais.roberta.syntax.codegen.AstToEv3PythonVisitorTest.IMPORTS)) + (de.fhg.iais.roberta.syntax.codegen.AstToEv3PythonVisitorTest.GLOBALS)) + "\nElement = 0\n") + "Element2 = 0\n") + "Element3 = \'none\'\n") + "def macheEtwas(x):\n") + "    Element3 = \'none\'\n\n") + "def run():\n") + "    global Element3\n") + "\n") + (de.fhg.iais.roberta.syntax.codegen.AstToEv3PythonVisitorTest.MAIN_METHOD);
    assertCodeIsOk(a, "/visitors/python_global_variables_check_one_used_variables.xml");
}