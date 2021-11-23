public char readChar() throws com.gmail.marzipankaiser.argumentreader.ArgumentReader.ArgumentException {
    if (((position) + 1) > (arguments.length()))
        syntaxError("Premature end of command.");
    
    if ((arguments.charAt(position)) == '[')
        replaceSubcommandHere();
    
    return arguments.charAt(((position)++));
}