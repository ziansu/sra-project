@com.pholser.junit.quickcheck.Property
public void whenGettingTheResourceOfAThing_TheResourcesOwnerIsTheThing(ai.grakn.concept.Thing thing, long seed) {
    ai.grakn.concept.Resource<?> resource = ai.grakn.property.PropertyUtil.choose(thing.resources(), seed);
    junit.framework.TestCase.assertTrue((((("[" + thing) + "] is connected to resource [") + resource) + "] but is not in it's owner set"), resource.ownerInstances().contains(thing));
}