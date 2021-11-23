private void checkTermination() {
    willTerminate = (((currentValue) == null) || (((termsLeft) != (java.lang.Integer.MIN_VALUE)) && ((termsLeft) == 0))) || (((terminatingCondition) != null) && (terminatingCondition.test(currentValue)));
}