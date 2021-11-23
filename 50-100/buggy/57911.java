public static synchronized void addMicrocontroller(java.lang.String alias, java.lang.Class<edu.ucla.cs.compilers.avrora.avrora.sim.mcu.MicrocontrollerFactory> uCFActory) throws java.lang.IllegalArgumentException {
    try {
        edu.ucla.cs.compilers.avrora.avrora.Defaults.microcontrollers.addInstance(alias, uCFActory.getConstructor().newInstance());
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException | java.lang.NoSuchMethodException | java.lang.SecurityException e) {
        throw new java.lang.IllegalArgumentException((("failed to invoke default constructor of class [" + (uCFActory.getName())) + "]"));
    }
}