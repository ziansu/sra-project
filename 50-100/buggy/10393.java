public void updateResults() {
    if (com.testing.Cliniops.Cliniops_ReusableMethodsTest.browserName.equalsIgnoreCase("Firefox")) {
        if (com.testing.Cliniops.Cliniops_ReusableMethodsTest.isPass)
            com.testing.Cliniops.Cliniops_ReusableMethodsTest.firefoxRes = "Pass";
        else
            com.testing.Cliniops.Cliniops_ReusableMethodsTest.firefoxRes = "Fail";
        
    }else
        if (com.testing.Cliniops.Cliniops_ReusableMethodsTest.browserName.equalsIgnoreCase("Chrome")) {
            if (com.testing.Cliniops.Cliniops_ReusableMethodsTest.isPass)
                com.testing.Cliniops.Cliniops_ReusableMethodsTest.chromeRes = "Pass";
            else
                com.testing.Cliniops.Cliniops_ReusableMethodsTest.chromeRes = "Fail";
            
        }else
            if (com.testing.Cliniops.Cliniops_ReusableMethodsTest.browserName.equalsIgnoreCase("IE")) {
                if (com.testing.Cliniops.Cliniops_ReusableMethodsTest.isPass)
                    com.testing.Cliniops.Cliniops_ReusableMethodsTest.ieRes = "Pass";
                else
                    com.testing.Cliniops.Cliniops_ReusableMethodsTest.ieRes = "Fail";
                
            }
        
    
}