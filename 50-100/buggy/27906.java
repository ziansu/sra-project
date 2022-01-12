@org.junit.Test
public void testErrorCase() throws java.lang.Exception {
    java.lang.System.out.println("testErrorCase");
    if (com.profesorfalken.jpowershell.OSDetector.isWindows()) {
        com.profesorfalken.jpowershell.PowerShell powerShell = com.profesorfalken.jpowershell.PowerShell.openSession();
        com.profesorfalken.jpowershell.PowerShellResponse response = powerShell.executeCommand("sfdsfdsf");
        java.lang.System.out.println(("Error:" + (response.getCommandOutput())));
        org.junit.Assert.assertTrue(response.getCommandOutput().contains("sfdsfdsf"));
        powerShell.close();
    }
}