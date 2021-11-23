protected static boolean inClassPath(java.lang.ClassLoader classLoader) {
    if ((org.helios.vm.VirtualMachineBootstrap.attachClassLoader.get()) != null)
        return true;
    
    try {
        java.lang.Class<?> clazz = java.lang.Class.forName(org.helios.vm.VirtualMachineBootstrap.VM_CLASS, true, classLoader);
        org.helios.vm.VirtualMachineBootstrap.attachClassLoader.set(clazz.getClassLoader());
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}