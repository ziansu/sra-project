@java.lang.Override
public scala.Tuple2<edu.wisc.streaming.Example, java.lang.Integer> call(java.lang.String s) {
    edu.wisc.streaming.Example e = edu.wisc.streaming.ListOfExamples.parseExampleFromString(s, testExamplesSet);
    int output = perceptron.runExample(e);
    return new scala.Tuple2(e, output);
}