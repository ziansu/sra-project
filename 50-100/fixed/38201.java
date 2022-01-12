public void updateTime(int warp) {
    double deltaT = t.getDeltaTime();
    unixTime += warp * deltaT;
    sideralTime += (((((15 * (java.lang.Math.PI)) * warp) * deltaT) / ((180.0 * 3600.0) * 1000.0)) * 366.0) / 365.0;
    if ((sideralTime) > (2 * (java.lang.Math.PI)))
        sideralTime -= 2 * (java.lang.Math.PI);
    
}