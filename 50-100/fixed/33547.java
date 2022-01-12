private static com.sun.tools.attach.VirtualMachine selectVMPID() {
    java.lang.String pid = javax.swing.JOptionPane.showInputDialog("Couldn't find any VM's! Enter your process id.");
    if ((pid == null) || (pid.isEmpty())) {
        java.lang.System.exit(0);
        return null;
    }
    try {
        com.sun.tools.attach.VirtualMachine vm = me.noverify.fieldmaster.utils.AttachUtils.getVirtualMachine(java.lang.Integer.parseInt(pid));
        return vm;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return me.noverify.fieldmaster.Inject.selectVMPID();
    }
}