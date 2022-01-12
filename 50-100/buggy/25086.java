@java.lang.Override
public void write(org.atlasapi.schedule.ChannelSchedule entity, org.atlasapi.output.FieldWriter writer, org.atlasapi.output.OutputContext ctxt) throws java.io.IOException {
    org.atlasapi.channel.ResolvedChannel resolvedChannel = org.atlasapi.channel.ResolvedChannel.builder(entity.getChannel()).build();
    writer.writeObject(channelWriter, resolvedChannel, ctxt);
    writer.writeField("source", resolvedChannel.getChannel().getSource());
    writer.writeList(entryWriter, entity.getEntries(), ctxt);
}