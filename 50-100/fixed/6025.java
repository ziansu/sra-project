public void restartGenerator() {
    support.setCancelEverything(false);
    myGenerator = null;
    ListOfParameterSetIds = new java.util.ArrayList<>();
    ListOfParameterSetsToBeWritten = new java.util.ArrayList<>();
    myGenerator = new toe.generator(ListOfParameterSetsToBeWritten, fileName, this, jTableParameterList);
    myGenerator.start();
    support.waitForGeneratorAsynchronous(myGenerator, this);
}