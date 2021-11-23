public static ask.atg.chat.server.model.Message create(final ask.atg.chat.server.model.User author, final java.lang.String msg) {
    return new ask.atg.chat.server.model.Message() {
        @java.lang.Override
        public java.lang.String getText() {
            return msg;
        }

        @java.lang.Override
        public java.util.Date getDate() {
            return new java.util.Date();
        }

        @java.lang.Override
        public java.lang.String getAuthor() {
            return author.getUsername();
        }
    };
}