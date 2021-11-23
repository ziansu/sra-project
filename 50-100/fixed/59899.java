@java.lang.Override
public com.aspectran.core.context.builder.AssistantLocal replicate() {
    com.aspectran.core.context.builder.AssistantLocal al = new com.aspectran.core.context.builder.AssistantLocal(((replicatedCount) + 1));
    al.setDescription(getDescription());
    com.aspectran.core.context.builder.DefaultSettings ds = getDefaultSettings();
    if (ds != null) {
        al.setDefaultSettings(new com.aspectran.core.context.builder.DefaultSettings(ds));
    }
    return al;
}