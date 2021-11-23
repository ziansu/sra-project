public void setRightShouldervNorm(mck.MatlabEngine proxy) throws java.lang.Exception {
    if ((RightShouldervNorm.MoCap.length) == (iListLength)) {
        RightShouldervNorm.enterMoCapData(commandList[1], proxy, initTime, false, counter);
    }else {
        RightShouldervNorm.enterMoCapData(commandList[1], proxy, initTime, true, ((RightShouldervNorm.MoCap.length) - 1));
    }
}