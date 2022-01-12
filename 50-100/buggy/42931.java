private void readForkJoinInfo(java.io.DataInputStream dataInStream, org.ballerinalang.util.codegen.PackageInfo packageInfo, org.ballerinalang.util.codegen.WorkerInfo workerInfo) throws java.io.IOException {
    int forkJoinCount = dataInStream.readShort();
    org.ballerinalang.util.codegen.ForkjoinInfo[] forkjoinInfos = new org.ballerinalang.util.codegen.ForkjoinInfo[forkJoinCount];
    for (int i = 0; i < forkJoinCount; i++) {
        org.ballerinalang.util.codegen.ForkjoinInfo forkjoinInfo = getForkJoinInfo(dataInStream, packageInfo);
        forkjoinInfos[forkjoinInfo.getIndex()] = forkjoinInfo;
    }
    workerInfo.setForkjoinInfos(forkjoinInfos);
}