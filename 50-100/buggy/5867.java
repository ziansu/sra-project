public rs.lukaj.stories.parser.types.Line compile() throws java.io.IOException, rs.lukaj.stories.exceptions.InterpretationException {
    java.util.List<java.lang.String> lines = rs.lukaj.stories.Utils.readAllLines(source);
    java.util.Iterator<java.lang.String> it = lines.iterator();
    while (it.hasNext())
        if (it.next().trim().isEmpty())
            it.remove();
        
    
    if (lines.isEmpty())
        throw new rs.lukaj.stories.exceptions.InterpretationException("File is empty!");
    
    rs.lukaj.stories.parser.Parser parser = new rs.lukaj.stories.parser.Parser();
    return parser.parse(lines, this);
}