public static void toggleBreak() {
    data.Slice sumSlice = data.SliceMap.getInstance().get("sum");
    if ((control.SliceHandler.currentSlice) != null) {
        control.SliceHandler.currentSlice.sliceTimer.stop();
        control.SliceHandler.lastSlice = control.SliceHandler.currentSlice;
        control.SliceHandler.currentSlice = null;
        sumSlice.sliceTimer.stop();
    }else {
        control.SliceHandler.currentSlice = control.SliceHandler.lastSlice;
        if ((control.SliceHandler.currentSlice) != null) {
            control.SliceHandler.currentSlice.sliceTimer.start();
        }
        sumSlice.sliceTimer.start();
    }
}