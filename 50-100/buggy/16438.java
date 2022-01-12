@java.lang.Override
public void setBeginTime(fontys.time.ITime beginTime) {
    if ((beginTime.compareTo(et)) < 0) {
        throw new java.lang.IllegalArgumentException(((("begin time " + (bt)) + " must be earlier than end time ") + (et)));
    }
    bt = beginTime;
}