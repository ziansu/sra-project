public static void deleteFiles(java.lang.String ip, it.cloud.amazon.ec2.VirtualMachine vm) throws java.lang.Exception {
    java.lang.String filesToBeDeleted = vm.getParameter("DELETE_FILES");
    it.cloud.amazon.ec2.VirtualMachine.deleteFiles(ip, vm, filesToBeDeleted.split(";"));
}