public static java.lang.String sequenceTestRun(java.lang.String fileName, ru.amaicode.hh.school.seq.algs.MatchingAlgorithm algorithm, ru.amaicode.hh.school.seq.InfiniteSequence sequence) throws java.io.FileNotFoundException {
    java.io.ByteArrayOutputStream outStream = new java.io.ByteArrayOutputStream();
    try (ru.amaicode.hh.school.runners.SearchSubsequencesRunner runner = ru.amaicode.hh.school.runners.SearchSubsequencesRunner.newRunner(ru.amaicode.hh.school.runners.TestRunner.getTestData(fileName), outStream, algorithm, sequence)) {
        runner.run();
    }
    return outStream.toString().trim();
}