public java.lang.String getCustomCommandLineOptions() {
    java.lang.String customOptions = super.getCustomCommandLineOptions();
    if ((j9vm.test.multipleorphans.InvokeDynamicWithMultipleOrphanComparisonTestRunner.commandIndex) == 0) {
        customOptions += " -Xshareclasses:enableBCI,name=invokedynamictestcache,reset" + " -Xtrace:print=tpnid{j9bcu.131}";
    }else
        if ((j9vm.test.multipleorphans.InvokeDynamicWithMultipleOrphanComparisonTestRunner.commandIndex) == 1) {
            customOptions += " -Xshareclasses:enableBCI,name=invokedynamictestcache,printStats=orphan+romclass";
        }else
            if ((j9vm.test.multipleorphans.InvokeDynamicWithMultipleOrphanComparisonTestRunner.commandIndex) == 2) {
                customOptions += " -Xshareclasses:enableBCI,name=invokedynamictestcache" + " -Xtrace:print=tpnid{j9bcu.131}";
            }else
                if ((j9vm.test.multipleorphans.InvokeDynamicWithMultipleOrphanComparisonTestRunner.commandIndex) == 3) {
                    customOptions += " -Xshareclasses:enableBCI,destroy,name=invokedynamictestcache";
                }
            
        
    
    if ((java.lang.Integer.parseInt(javaVersion)) >= 90) {
        customOptions += " --add-exports=openj9.sharedclasses/com.ibm.oti.shared=ALL-UNNAMED ";
    }
    return customOptions;
}