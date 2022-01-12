public int numberOfToggleValues() {
    try {
        return ((((masterType) == (org.harctoolbox.girr.Command.MasterType.parameters)) && (!(parameters.containsKey(org.harctoolbox.girr.Command.toggleParameterName)))) && (protocol.hasParameter(org.harctoolbox.girr.Command.toggleParameterName))) && (protocol.hasParameterMemory(org.harctoolbox.girr.Command.toggleParameterName)) ? ((int) (protocol.getParameterMax(org.harctoolbox.girr.Command.toggleParameterName))) + 1 : 1;
    } catch (org.harctoolbox.IrpMaster.UnassignedException ex) {
        assert false;
        return 1;
    }
}