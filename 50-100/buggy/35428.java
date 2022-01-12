public java.lang.String getCustomCommandLineOptions() {
    java.lang.String customOptions = super.getCustomCommandLineOptions();
    switch (j9vm.test.jarfileupdate.JarFileUpdateTestRunner.commandIndex) {
        case 0 :
            customOptions += "-Xshareclasses:name=jarfileupdatetest,reset ";
            break;
        case 1 :
            customOptions += "-Xshareclasses:name=jarfileupdatetest ";
            break;
        case 2 :
            customOptions += "-Xshareclasses:name=jarfileupdatetest,destroy ";
            break;
    }
    if ((java.lang.Integer.parseInt(javaVersion)) >= 90) {
        customOptions += " --add-exports=openj9.sharedclasses/com.ibm.oti.shared=ALL-UNNAMED ";
    }
    return customOptions;
}