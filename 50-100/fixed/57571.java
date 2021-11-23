public void setRightHipvNorm(mck.MatlabEngine proxy) throws java.lang.Exception {
    if ((RightHipvNorm.MoCap.length) == (iListLength)) {
        RightHipvNorm.enterMoCapData(commandList[3], proxy, initTime, false);
    }else {
        RightHipvNorm.enterMoCapData(commandList[3], proxy, initTime, true);
    }
}