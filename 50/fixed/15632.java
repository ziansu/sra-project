public boolean isTime() {
    if (((java.lang.System.currentTimeMillis()) - (lastTime)) >= (FRAME_MILLIS_TARGET)) {
        return true;
    }else {
        return false;
    }
}