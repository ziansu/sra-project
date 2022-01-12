private void updateValue(boolean initial) {
    if (!(checkCells())) {
        bad = true;
        initial = false;
    }else {
        if ((operation.equals("sum")) || (operation.equals("avg"))) {
            value = doSumAndAvg(splitIdentifiers, operation);
        }else {
            getValues();
            value = doMdas(splitInput);
        }
    }
    if (initial) {
        setDimensions();
    }
}