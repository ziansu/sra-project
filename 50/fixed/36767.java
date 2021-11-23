public double min() {
    if (!(hasCapacity())) {
        return data[0];
    }else {
        return org.hipparchus.stat.StatUtils.min(getData());
    }
}