private void parseIntervalType() {
    for (int i = dooyit.parser.DeleteParser.INDEX_SINGLE; i < (dooyit.parser.DeleteParser.splitInput.length); i++) {
        if (dooyit.parser.DeleteParser.splitInput[i].equals("-")) {
            if ((!(isNumber(dooyit.parser.DeleteParser.splitInput[(i - 1)]))) || (!(isNumber(dooyit.parser.DeleteParser.splitInput[(i + 1)])))) {
                throw new dooyit.exception.IncorrectInputException("Invalid Number!");
            }else {
                setInterval(dooyit.parser.DeleteParser.splitInput, i);
            }
        }
    }
}