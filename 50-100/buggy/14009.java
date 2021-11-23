@java.lang.Override
public void run() {
    if (((java.lang.System.currentTimeMillis()) - (t0)) > ((currentInstructions.getTime()) * 1000)) {
        cancel();
        if ((programInstructions.size()) != 0) {
            runProgramRecursive();
        }
    }else {
        mFlightController.sendVirtualStickFlightControlData(currentInstructions.getInstructions(), null);
        globalString = java.lang.Float.toString(currentInstructions.getInstructions().getPitch());
    }
}