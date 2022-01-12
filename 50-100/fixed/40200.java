private static void printProperty(java.lang.String propName, java.lang.String propValue) {
    java.lang.System.out.print(((propName + "=") + propValue));
    java.lang.Long lValue = voldemort.tools.admin.command.AdminCommandMeta.SubCommandMetaCheckVersion.tryParse(propValue);
    if (lValue > 0) {
        java.util.Date date = new java.util.Date(lValue);
        java.lang.System.out.print(((" [ " + (date.toString())) + " ] "));
    }
    java.lang.System.out.println();
}