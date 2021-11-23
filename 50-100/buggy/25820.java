private void addFunction(java.lang.String token, java.lang.Class<? extends ohm.dexp.function.TokenFunction> functionClass) {
    ohm.dexp.function.TokenFunction.addFunction(token, functionClass);
    try {
        ohm.dexp.function.TokenFunction manager = functionClass.getConstructor().newInstance();
        java.lang.System.out.println(((token + ": ") + (manager.getType())));
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
    }
}