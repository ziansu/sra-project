private void checkTermination() {
    willTerminate = (((currentValue) == null) || (((termsLeft) != (java.lang.Integer.MIN_VALUE)) && ((termsLeft) <= 1))) || (((terminatingCondition) != null) && (terminatingCondition.test(currentValue)));
}