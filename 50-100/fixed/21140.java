private static java.lang.CharSequence doPeek(final java.lang.CharSequence pattern) {
    java.lang.CharSequence returnPattern;
    if (FourBitTwoDisclosureDeviceUnlocker.isPeekValid(pattern)) {
        FourBitTwoDisclosureDeviceUnlocker.appendTrace("peek : with pattern", pattern);
        returnPattern = FourBitTwoDisclosureDeviceUnlocker.dev.peek(pattern);
        FourBitTwoDisclosureDeviceUnlocker.peekedPattern = returnPattern;
        FourBitTwoDisclosureDeviceUnlocker.appendTrace("return peekedPattern", returnPattern);
        FourBitTwoDisclosureDeviceUnlocker.state = FourBitTwoDisclosureDeviceUnlocker.STATE_PEEKED;
    }else {
        FourBitTwoDisclosureDeviceUnlocker.appendTrace("doPeek : invalid doPeek call with bits", pattern);
        returnPattern = pattern;
    }
    return returnPattern;
}