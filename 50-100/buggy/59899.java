@java.lang.Override
public com.aspectran.core.context.builder.AssistantLocal replicate() {
    com.aspectran.core.context.builder.AssistantLocal al = new com.aspectran.core.context.builder.AssistantLocal(((replicatedCount) + 1));
    al.setDescription(al.getDescription());
    com.aspectran.core.context.builder.DefaultSettings ds = al.getDefaultSettings();
    if (ds != null) {
        al.setDefaultSettings(new com.aspectran.core.context.builder.DefaultSettings(ds));
    }
    return al;
}