public static java.lang.String[] getCorrectNumberOfParameters(java.lang.String goodParameter, java.lang.String inputCommand, int countParameters) throws ua.com.juja.sergiishcherbakov.sqlcmd.model.exeptions.IncorrectNumberOfParametersException {
    java.lang.String[] data = inputCommand.split("[|]");
    if ((data.length) != countParameters) {
        throw new ua.com.juja.sergiishcherbakov.sqlcmd.model.exeptions.IncorrectNumberOfParametersException((((countParameters + " parameters are expected but ") + (data.length)) + " is entered"));
    }
    if (ua.com.juja.sergiishcherbakov.sqlcmd.model.CorrectParameterChecker.isCorrectFirstParameter(goodParameter, data[0])) {
        return data;
    }else {
        throw new ua.com.juja.sergiishcherbakov.sqlcmd.model.exeptions.IncorrectNumberOfParametersException("");
    }
}