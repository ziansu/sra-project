@java.lang.Override
public de.uni_freiburg.informatik.ultimate.core.model.models.ModelType getOutputDefinition() {
    if ((mInputDefinition) == null) {
        return null;
    }else {
        return new de.uni_freiburg.informatik.ultimate.core.model.models.ModelType(Activator.PLUGIN_ID, mInputDefinition.getType(), mInputDefinition.getFileNames());
    }
}