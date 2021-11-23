public static void main(java.lang.String[] args) {
    try {
        org.continuousassurance.swamp.cli.SwampApiWrapper test_api = new org.continuousassurance.swamp.cli.SwampApiWrapper();
        test_api.login(args[0], args[1]);
        test_api.printUserInfo();
        test_api.printAllProjects();
        test_api.printAllPackages(null, true);
        test_api.printAllTools(null);
    } catch (java.lang.Exception name) {
        name.printStackTrace(java.lang.System.out);
    }
}