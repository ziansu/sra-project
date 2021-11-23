public void setRightElbowAngl(mck.MatlabEngine proxy) throws java.lang.Exception {
    if ((RightElbowAngl.MoCap.length) == (iListLength)) {
        RightElbowAngl.enterMoCapData(commandList[11], proxy, initTime, false, counter);
    }else {
        RightElbowAngl.enterMoCapData(commandList[11], proxy, initTime, true, ((RightShouldervNorm.MoCap.length) - 1));
    }
}