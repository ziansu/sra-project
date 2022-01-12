public static java.lang.Number incrementalAverage(java.lang.Number running, java.lang.Number number, int count) {
    java.lang.Number sum = com.cinchapi.concourse.util.Numbers.multiply(running, (count - 1));
    sum = com.cinchapi.concourse.util.Numbers.add(sum, number);
    return com.cinchapi.concourse.util.Numbers.divide(sum, count);
}