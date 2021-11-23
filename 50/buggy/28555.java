@java.lang.Override
public void train(data.ClassifiedData data) {
    data.Vector x = data.asVector();
    modifyNetwork(((data.getClassId()) - 1), calculateOutput(x), x);
}