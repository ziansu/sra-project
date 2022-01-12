@java.lang.Override
public <WRITTEN_TYPE extends java.io.Serializable> void writeFor(final java.lang.Class<? extends de.uka.ipd.sdq.beagle.core.BlackboardStorer<WRITTEN_TYPE>> writer, final WRITTEN_TYPE written) {
    this.blackboard.writeFor(writer, written);
}