void loopEvery() {
    if (((counter) % (loopOnceEveryNTimes)) == 0) {
        loop();
    }
    (counter)++;
}