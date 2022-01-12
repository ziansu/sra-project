private void parseSingleType() {
    if (isNumber(dooyit.parser.DeleteParser.splitInput[dooyit.parser.DeleteParser.INDEX_SINGLE])) {
        dooyit.parser.DeleteParser.taskIdForDeletion = java.lang.Integer.parseInt(dooyit.parser.DeleteParser.splitInput[dooyit.parser.DeleteParser.INDEX_SINGLE]);
    }else {
        throw new dooyit.exception.IncorrectInputException("Invalid Task ID!");
    }
}