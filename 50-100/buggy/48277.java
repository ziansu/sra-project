public void addTest(boolean hidden, java.lang.Object expectedReturnValue, java.lang.Object... parameterValues) throws codeFighter.exceptions.FighterException {
    if ((parameterValues.length) == (parameterTypes.length)) {
        if (hidden) {
            this.tests.add(codeFighter.utils.FighterTest.createHiddenTest(parameterValues, expectedReturnValue));
        }else {
            this.tests.add(codeFighter.utils.FighterTest.createPublicTest(parameterValues, expectedReturnValue));
        }
    }else {
        throw new codeFighter.exceptions.FighterException("Invalid number of parameters");
    }
}