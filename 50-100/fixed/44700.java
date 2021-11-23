@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if ((obj.getClass()) == (this.getClass())) {
        org.collabthings.model.impl.CTPartBuilderImpl builder = ((org.collabthings.model.impl.CTPartBuilderImpl) (obj));
        return getObject().toYaml().equals(builder.getObject().toYaml());
    }else {
        return false;
    }
}