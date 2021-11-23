private static void searchDetails(java.lang.String argsString) {
    java.lang.String temp = argsString;
    java.lang.String[] stringArray = temp.trim().split(urgenda.parser.commandParser.NewEditCommandParser.combinedRegex);
    if ((stringArray.length) == 0) {
        urgenda.parser.commandParser.NewEditCommandParser.parseTimeWithoutKeyWord(temp);
    }else {
        urgenda.parser.commandParser.NewEditCommandParser.parseDetailsWithKeyWords(temp, stringArray);
    }
}