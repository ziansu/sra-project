public void uploadData() {
    if (hasPendingData()) {
        org.haxe.duell.input.DuellInputTouch.DuellInputTouchData d = pendingData.removeFirst();
        org.haxe.duell.input.DuellInputNativeInterface.touchInfo(id, d.x, d.y, d.state);
        if ((lastDataUploaded) != null) {
            org.haxe.duell.input.DuellInputTouch.DuellInputTouchData.recycle(lastDataUploaded);
        }
        lastDataUploaded = d;
    }else {
        org.haxe.duell.input.DuellInputNativeInterface.touchInfo(id, lastDataUploaded.x, lastDataUploaded.y, 1);
    }
}