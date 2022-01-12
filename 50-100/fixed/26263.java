private dooyit.parser.DeleteParser.DELETE_TYPE getDeleteType() {
    if (dooyit.parser.DeleteParser.userInput.contains("-")) {
        return dooyit.parser.DeleteParser.DELETE_TYPE.INTERVAL;
    }else
        if ((dooyit.parser.DeleteParser.splitInput.length) == 1) {
            return dooyit.parser.DeleteParser.DELETE_TYPE.SINGLE;
        }else
            if ((dooyit.parser.DeleteParser.splitInput.length) > 1) {
                return dooyit.parser.DeleteParser.DELETE_TYPE.MULTIPLE;
            }else {
                return dooyit.parser.DeleteParser.DELETE_TYPE.INVALID;
            }
        
    
}