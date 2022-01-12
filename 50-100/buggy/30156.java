public java.lang.String randommutate(java.lang.String input) {
    int type = gettype(input);
    TestCaseMutation.MutateOperator.NumberMutator operation = null;
    if (type == (TestCaseMutation.MutateOperator.DOUBLE)) {
        operation = TestCaseMutation.MutateOperator.DoubleMutator.randomMutator();
    }
    if (type == (TestCaseMutation.MutateOperator.INT)) {
        operation = TestCaseMutation.MutateOperator.IntMutator.randomMutator();
    }
    return mutate(input, type, operation);
}