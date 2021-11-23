public void execute() {
    final ru.spbstu.dis.DataInput integerDoubleHashMap = dataProvider.nextDataPortion();
    ru.spbstu.dis.EmergencyPredictor.LOGGER.info(("Data portion is " + integerDoubleHashMap));
    final ru.spbstu.dis.ChosenAction chosenAction = knowledgeBase.inferOutput(integerDoubleHashMap);
    ru.spbstu.dis.EmergencyPredictor.LOGGER.info(("Chosen action is " + chosenAction));
    chosenActionListener.accept(chosenAction);
}