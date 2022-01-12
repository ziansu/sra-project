protected void replaceSubcommandHere() throws com.gmail.marzipankaiser.argumentreader.ArgumentReader.ArgumentException {
    if (!(replaceSubcommands))
        return ;
    
    int pos = position;
    java.lang.String subcmd = ArgumentType.STRING_IN_SQUARE_BRACKETS.readAndValidateFrom(this);
    java.lang.String value = subcommandLibrary.execute(subcmd);
    java.lang.StringBuffer sb = new java.lang.StringBuffer(arguments);
    sb.replace(pos, position, value);
    arguments = sb.toString();
    position = pos;
}