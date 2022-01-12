public void setyDirRightHip(mck.MatlabEngine proxy) throws java.lang.Exception {
    if ((yDirRightHip.MoCap.length) == (iListLength)) {
        yDirRightHip.enterMoCapData(commandList[16], proxy, initTime, false);
    }else {
        yDirRightHip.enterMoCapData(commandList[16], proxy, initTime, true);
    }
}