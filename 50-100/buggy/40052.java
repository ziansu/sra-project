@org.junit.Test
public void testImmutableSimpleHashFactoryIdentifierDependentCached() {
    burlap.oomdp.singleagent.SADomain domain = ((burlap.oomdp.singleagent.SADomain) (this.gridWorldTest.getDomain()));
    burlap.oomdp.core.states.State startState = this.gridWorldTest.generateState();
    burlap.oomdp.statehashing.HashableStateFactory factory = new burlap.oomdp.statehashing.SimpleHashableStateFactory(true, true);
    java.util.Set<burlap.oomdp.statehashing.HashableState> hashedStates = this.getReachableHashedStates(new burlap.oomdp.core.states.ImmutableState(startState), domain, factory);
    assert (hashedStates.size()) == 104;
}