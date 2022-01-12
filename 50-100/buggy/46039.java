@org.junit.Test
public void testListDir() throws java.lang.Exception {
    java.lang.System.out.println("testListDir");
    if (com.profesorfalken.jpowershell.OSDetector.isWindows()) {
        com.profesorfalken.jpowershell.PowerShell powerShell = com.profesorfalken.jpowershell.PowerShell.openSession();
        com.profesorfalken.jpowershell.PowerShellResponse response = powerShell.executeCommand("dir");
        java.lang.System.out.println(("List Directory:" + (response.getCommandOutput())));
        org.junit.Assert.assertTrue(response.getCommandOutput().contains("LastWriteTime"));
        powerShell.close();
    }
}