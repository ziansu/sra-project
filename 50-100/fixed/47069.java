@java.lang.Override
public void write(@javax.annotation.Nonnull
org.atlasapi.content.PriorityScoreReasons entity, @javax.annotation.Nonnull
org.atlasapi.output.FieldWriter writer, @javax.annotation.Nonnull
org.atlasapi.output.OutputContext ctxt) throws java.io.IOException {
    writer.writeList("positive", "positive", ((entity.getPositive()) != null ? entity.getPositive() : null), ctxt);
    writer.writeList("negative", "negative", ((entity.getNegative()) != null ? entity.getNegative() : null), ctxt);
}