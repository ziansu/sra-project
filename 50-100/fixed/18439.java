private static codeu.chat.util.Uuid fromString(final codeu.chat.util.Uuid root, java.lang.String[] tokens, int index) {
    final int id = ((int) (java.lang.Long.parseLong(tokens[index])));
    final codeu.chat.util.Uuid link = new codeu.chat.util.Uuid(root, id);
    final int nextIndex = index + 1;
    return nextIndex < (tokens.length) ? codeu.chat.util.Uuid.fromString(link, tokens, nextIndex) : link;
}