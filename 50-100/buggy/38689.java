private static void resetFields() {
    planner.Parser.resultType = planner.Constants.RESULT_TYPE.VALID;
    planner.Parser.commandType = null;
    planner.Parser.commandNeedingHelp = null;
    planner.Parser.keywordArgs = "";
    planner.Parser.commandWords = null;
    planner.Parser.date = null;
    planner.Parser.dateToRemind = null;
    planner.Parser.priorityLevel = 0;
    planner.Parser.id = 0;
    planner.Parser.name = "";
    planner.Parser.description = "";
    planner.Parser.tag = "";
    planner.Parser.errorMessage = "";
    planner.Parser.flags = new boolean[7];
    planner.Parser.calendar = null;
}