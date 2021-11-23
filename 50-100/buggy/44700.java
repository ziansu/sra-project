@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof org.collabthings.model.impl.CTPartBuilderImpl) {
        org.collabthings.model.impl.CTPartBuilderImpl builder = ((org.collabthings.model.impl.CTPartBuilderImpl) (obj));
        return getObject().toYaml().equals(builder.getObject().toYaml());
    }else {
        return false;
    }
}