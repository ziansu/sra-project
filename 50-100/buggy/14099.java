public void parseInputMatrixSizes() {
    isMultiplyButtonEnabled = false;
    isOkButtonEnabled = false;
    try {
        tryParseInputMatrixSizes();
        if ((isInputMatrixSizesAvailable()) && ((width1) == (height2))) {
            isOkButtonEnabled = true;
        }
        if ((status) != (ru.unn.agile.LongArithmetic.viewmodel.ViewModel.Status.WAITING)) {
            if (isOkButtonEnabled) {
                status = ru.unn.agile.LongArithmetic.viewmodel.ViewModel.Status.READY_OK;
            }else {
                status = ru.unn.agile.LongArithmetic.viewmodel.ViewModel.Status.WAITING_WIDTH_AND_HEIGHT_MATRICES;
            }
        }
    } catch (java.lang.Exception e) {
        status = ru.unn.agile.LongArithmetic.viewmodel.ViewModel.Status.BAD_FORMAT;
    }
}