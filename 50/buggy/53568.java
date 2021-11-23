public void setN(int n, float f) {
    if ((n < 0) || ((vals.length) < n)) {
        time.api.debug.Debug.log("value not in range", 3);
    }
}