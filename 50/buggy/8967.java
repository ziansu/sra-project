public int addForkJoinInfo(org.wso2.ballerinalang.programfile.ForkjoinInfo forkjoinInfo) {
    forkjoinInfoList.add(forkjoinInfo);
    return forkjoinInfoList.indexOf(forkjoinInfo);
}