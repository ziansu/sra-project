private int getDividerBySeekBarId(@android.support.annotation.IdRes
int id) {
    switch (id) {
        case R.id.givenDomesticHotWaterTempBar :
            return 10;
        case R.id.heatingCurveBar :
            return 100;
        case R.id.desiredInsideTempBar :
            return 10;
        case R.id.threeWayValveHisteresisBar :
            return 10;
        case R.id.domesticHotWaterHisteresisBar :
            return 10;
        case R.id.minimalBufferReserveBar :
            return 10;
        case R.id.maximalBufferReserveBar :
            return 10;
        case R.id.openThreeWayValveDegreesBar :
            return 10;
        case R.id.closeThreeWayValveDegreesBar :
            return 10;
        case R.id.errorAfterBadTempReadingsBar :
            return 1;
    }
    throw new java.lang.IllegalArgumentException((("SeekBar with id: " + id) + "does not exists!"));
}