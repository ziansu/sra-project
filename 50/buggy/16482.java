@java.lang.Override
public ai.core.AI clone() {
    ai.puppet.PuppetSearchAB ps = new ai.puppet.PuppetSearchAB(MAX_TIME, MAX_ITERATIONS, script, eval);
    ps.lastChoices = lastChoices;
    ps.lastSearchTime = lastSearchTime;
    return ps;
}