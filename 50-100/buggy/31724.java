public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Running CartPoint Test...");
    if (TemplateMethod.main.cpTest()) {
        java.lang.System.out.println("passed.");
    }else
        java.lang.System.out.println("failed.");
    
    java.lang.System.out.println("Running Currency Test...");
    if (TemplateMethod.main.cTest()) {
        java.lang.System.out.println("passed.");
    }else
        java.lang.System.out.println("failed.");
    
    TemplateMethod.main.simpleTest();
}