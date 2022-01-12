public static TestCaseMutation.MutateOperator.NumberMutator randomMutator() {
    return TestCaseMutation.MutateOperator.IntMutator.VALUES.get(TestCaseMutation.MutateOperator.IntMutator.RANDOM.nextInt(((TestCaseMutation.MutateOperator.IntMutator.SIZE) - 1)));
}