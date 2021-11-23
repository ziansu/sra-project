private java.lang.String getListOption(java.lang.String userCmd) {
    if (userCmd == null) {
        return null;
    }
    if (userCmd.contains(DelimiterConstants.TASK_FILTER_ALL)) {
        return constants.CmdParameters.PARAM_VALUE_LIST_ALL;
    }else
        if (userCmd.contains(DelimiterConstants.TASK_FILTER_DONE)) {
            return constants.CmdParameters.PARAM_VALUE_LIST_DONE;
        }else
            if (userCmd.contains(DelimiterConstants.TASK_SPECIFIER_PRIORITY)) {
                return constants.CmdParameters.PARAM_VALUE_LIST_PRIORITY;
            }else {
                return null;
            }
        
    
}