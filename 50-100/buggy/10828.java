private void pickOut(courier.Parcel pickOut) {
    pickOut.arriveTime = map.schedule.getSteps();
    if (carrying.remove(pickOut)) {
        spaceRemaining += pickOut.weight;
    }
    if (!(pickOut instanceof courier.CarCaller)) {
        printParcelUnloadLog(pickOut);
        currStation.pArrived.add(pickOut);
        (map.parcelTotal)--;
        tryTerminate();
    }else {
        carCallerConvertParcel(((courier.CarCaller) (pickOut)));
        printCarCallerUnloadLog(((courier.CarCaller) (pickOut)));
    }
    initCarState();
}