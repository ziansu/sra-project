public char tryReadChar() throws com.gmail.marzipankaiser.argumentreader.ArgumentReader.ArgumentException {
    if (((position) + 1) >= (arguments.length()))
        return ' ';
    
    if ((arguments.charAt(position)) == '[')
        replaceSubcommandHere();
    
    return arguments.charAt(((position)++));
}