public void setzDirRightHip(mck.MatlabEngine proxy) throws java.lang.Exception {
    if ((cDirRightHip.MoCap.length) == (iListLength)) {
        zDirRightHip.enterMoCapData(commandList[17], proxy, initTime, false, counter);
    }else {
        zDirRightHip.enterMoCapData(commandList[17], proxy, initTime, true, ((zDirRightHip.MoCap.length) - 1));
    }
}