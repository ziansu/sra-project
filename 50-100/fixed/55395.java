public static ask.atg.chat.server.model.Message create(final java.lang.String author, final java.lang.String msg) {
    final java.util.Date date = new java.util.Date();
    return new ask.atg.chat.server.model.Message() {
        @java.lang.Override
        public java.lang.String getText() {
            return msg;
        }

        @java.lang.Override
        public java.util.Date getDate() {
            return date;
        }

        @java.lang.Override
        public java.lang.String getAuthor() {
            return author;
        }
    };
}