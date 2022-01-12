protected void succeed() {
    switch (state) {
        case CLOSED :
            if ((successes.incrementAndGet()) >= (successThreshold))
                failures.set(0);
            
            break;
        case HALF_OPEN :
            if ((successes.incrementAndGet()) >= (successThreshold)) {
                reset();
            }
            break;
    }
}