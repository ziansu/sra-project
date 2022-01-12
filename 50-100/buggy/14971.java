public static java.lang.Number incrementalAverage(java.lang.Number running, java.lang.Number number, int count) {
    java.lang.Number dividend = com.cinchapi.concourse.util.Numbers.add(number, com.cinchapi.concourse.util.Numbers.multiply((-1), running));
    java.lang.Number addend = com.cinchapi.concourse.util.Numbers.divide(dividend, count);
    return com.cinchapi.concourse.util.Numbers.add(running, addend);
}