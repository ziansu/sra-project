public void closeWindows() throws dynamicmdpcontroller.controllers.FinalStateException, java.io.IOException, java.text.ParseException {
    if (((frame) != null) && ((dataDisplay) != null)) {
        frame.dispose();
        chart.close();
        if ((index) != (-1))
            mba.PathFinished(lastComputeState.thisState.s);
        
    }
}