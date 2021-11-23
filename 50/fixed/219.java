@java.lang.Override
public org.orekit.propagation.SpacecraftState resetState(final org.orekit.propagation.SpacecraftState oldState) throws org.orekit.errors.OrekitException {
    return event.resetState(oldState);
}