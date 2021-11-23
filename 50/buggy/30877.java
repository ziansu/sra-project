void loopEvery() {
    if (((counter) % (loopOnceEveryNTimes)) == 0) {
        loop();
        java.lang.System.out.println("executed loop");
    }
    (counter)++;
}