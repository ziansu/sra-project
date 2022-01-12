@java.lang.Override
public void exitMkdir(@org.antlr.v4.runtime.misc.NotNull
edu.cabrillo.vmware.parsers.CLIParser.MkdirContext ctx) {
    com.vmware.vim25.ManagedObjectReference parent = ((edu.cabrillo.vmware.Runtime.VRL) (programStack.pop())).popMOR();
    java.lang.String name = ((java.lang.String) (programStack.pop()));
    try {
        edu.cabrillo.vmware.Actions.mkdir(parent, name);
    } catch (javax.xml.ws.soap.SOAPFaultException | com.vmware.vim25.InvalidPropertyFaultMsg | com.vmware.vim25.RuntimeFaultFaultMsg | com.vmware.vim25.DuplicateNameFaultMsg | com.vmware.vim25.InvalidCollectorVersionFaultMsg | com.vmware.vim25.InvalidLocaleFaultMsg | com.vmware.vim25.InvalidLoginFaultMsg | javax.xml.datatype.DatatypeConfigurationException | com.vmware.vim25.InvalidNameFaultMsg e) {
        throw new java.lang.RuntimeException("Error during move", e);
    }
}