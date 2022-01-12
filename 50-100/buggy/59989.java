public int getWaterCode(boolean waterToLeft, boolean waterToTop, boolean waterToRight, boolean waterToBottom) {
    int sum = 0;
    if (waterToLeft) {
        sum += com.developworlds.planetsexample.view.WaterTileHelper.LEFT;
    }
    if (waterToTop) {
        sum += com.developworlds.planetsexample.view.WaterTileHelper.TOP;
    }
    if (waterToRight) {
        sum += com.developworlds.planetsexample.view.WaterTileHelper.RIGHT;
    }
    if (waterToBottom) {
        sum += com.developworlds.planetsexample.view.WaterTileHelper.BOTTOM;
    }
    return sum == 0 ? sum : sum - 1;
}