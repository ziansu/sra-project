private static void computeMaxRandomNumberAndTimes() {
    for (int i = 0; i <= 100; i++) {
        if (((day1.test9.Test.hashtable.get(i)) != null) && ((day1.test9.Test.hashtable.get(i)) == (day1.test9.Test.maxTimes))) {
            java.lang.System.out.println(((("number: \t" + i) + "\t times: \t") + (day1.test9.Test.hashtable.get(i))));
        }
    }
}