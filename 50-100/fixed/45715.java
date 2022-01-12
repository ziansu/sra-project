public static chatty.util.commands.CustomCommand parse(java.lang.String input) {
    chatty.util.commands.Parser parser = new chatty.util.commands.Parser(input);
    try {
        return new chatty.util.commands.CustomCommand(parser.parse());
    } catch (java.text.ParseException ex) {
        return new chatty.util.commands.CustomCommand(ex.getLocalizedMessage());
    }
}