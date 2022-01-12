public void setzDirRightHip(mck.MatlabEngine proxy) throws java.lang.Exception {
    if ((zDirRightHip.MoCap.length) == (iListLength)) {
        zDirRightHip.enterMoCapData(commandList[17], proxy, initTime, false);
    }else {
        zDirRightHip.enterMoCapData(commandList[17], proxy, initTime, true);
    }
}