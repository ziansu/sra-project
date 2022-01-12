public java.util.concurrent.CompletableFuture<io.discloader.discloader.entity.message.Message> sendEmbed(io.discloader.discloader.entity.RichEmbed embed) {
    java.io.File file = null;
    io.discloader.discloader.entity.sendable.Attachment attachment = null;
    if (((embed.thumbnail) != null) && ((embed.thumbnail.file) != null)) {
        file = embed.thumbnail.file;
        embed.thumbnail.file = null;
        attachment = new io.discloader.discloader.entity.sendable.Attachment(file.getName());
    }
    return loader.rest.sendMessage(this, null, embed, attachment, file);
}