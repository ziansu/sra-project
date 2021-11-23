@java.lang.Override
public int match(com.shieldsbetter.flexcompilator.ParseHead h) throws com.shieldsbetter.flexcompilator.NoMatchException, com.shieldsbetter.flexcompilator.WellFormednessException {
    before(h);
    try {
        int result = h.advanceOver(myBase);
        onMatched(h);
    } catch (com.shieldsbetter.flexcompilator.NoMatchException nme) {
        onFailed(h);
        throw nme;
    }
    return result;
}