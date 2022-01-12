public static void retrieveFiles(java.lang.String ip, it.cloud.amazon.ec2.VirtualMachine vm, int count, java.lang.String localPath, java.lang.String remotePath) throws java.lang.Exception {
    java.lang.String filesToBeGet = vm.getParameter("RETRIEVE_FILES");
    it.cloud.amazon.ec2.VirtualMachine.retrieveFiles(ip, vm, count, filesToBeGet.split(";"), localPath, remotePath);
}