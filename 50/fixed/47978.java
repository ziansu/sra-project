boolean isDaemonUnhealthy() {
    return (isTenuredSpaceExhausted()) || (isPermGenSpaceExhausted());
}