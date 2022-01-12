private static com.equinox.Signal handleInput(com.equinox.Memory memory, java.lang.String input) {
    com.equinox.ParsedInput c = com.equinox.Parser.parseInput(input);
    return com.equinox.Zeitgeist.execute(c, memory);
}