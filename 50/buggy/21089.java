public <WRITTEN_TYPE extends java.io.Serializable> WRITTEN_TYPE readFor(final java.lang.Class<? extends de.uka.ipd.sdq.beagle.core.BlackboardStorer<WRITTEN_TYPE>> writer) {
    return blackboard.readFor(writer);
}