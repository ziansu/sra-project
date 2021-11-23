@java.lang.Override
public java.lang.String parse(com.dwarfartisan.parsec.State<java.lang.Character> s) throws com.dwarfartisan.parsec.ParsecException, java.io.EOFException {
    new com.dwarfartisan.parsec.Newline().parse(s);
    try {
        new com.dwarfartisan.parsec.Try<java.lang.Character, java.lang.Character>(new com.dwarfartisan.parsec.Ch('\r')).parse(s);
        return "\n\r";
    } catch (java.io.EOFException e) {
        return "\n";
    }
}