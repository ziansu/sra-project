public void _vtepBindVlan(org.eclipse.osgi.framework.console.CommandInterpreter ci) {
    ci.println("Let's bind a vlan");
    java.lang.String vlan = ci.nextArgument();
    java.lang.String lsName = ci.nextArgument();
    java.lang.String portName = ci.nextArgument();
    vtepBindVlan(lsName, portName, vlan, null);
}