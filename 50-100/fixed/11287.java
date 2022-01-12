@java.lang.Override
public void call(caesar.interpreter.CaesarInterpreter interpreter) {
    caesar.interpreter.buildin.StringClass.logger.log(java.util.logging.Level.FINE, "addString from StringClass is called.");
    java.lang.String opb = interpreter.getStack().popString();
    java.lang.String opa = interpreter.getStack().popString();
    java.lang.String result = opa + opb;
    interpreter.getStack().pushString(result);
}