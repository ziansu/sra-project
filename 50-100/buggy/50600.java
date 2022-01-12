private void updateValue(boolean initial) {
    if (!(checkCells())) {
        java.lang.System.out.println("Error: operation contains a non number cell");
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