public void setWeight(int weight) {
    waitTime = (java.lang.System.currentTimeMillis()) - (waitTime);
    (this.rx_cnt)++;
    android.util.Log.e("scaler", (((address) + " wait=") + (waitTime)));
    waitTime = java.lang.System.currentTimeMillis();
    if ((java.lang.Math.abs((weight - (this.weight)))) < 1000) {
        this.weight = weight;
    }
}