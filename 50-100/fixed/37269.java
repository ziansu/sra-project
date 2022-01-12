private void parse() {
    int lastOccurrenceOfMarker = dooyit.parser.AddCatParser.userInput.lastIndexOf(dooyit.parser.AddCatParser.MARKER);
    if (lastOccurrenceOfMarker != (-1)) {
        dooyit.parser.AddCatParser.catName = dooyit.parser.AddCatParser.userInput.substring(0, lastOccurrenceOfMarker).trim();
        dooyit.parser.AddCatParser.colour = dooyit.parser.AddCatParser.userInput.substring(lastOccurrenceOfMarker).replace(dooyit.parser.AddCatParser.MARKER, "").trim();
    }else {
        dooyit.parser.AddCatParser.catName = dooyit.parser.AddCatParser.userInput.trim();
    }
}