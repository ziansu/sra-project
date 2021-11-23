@org.junit.Test
public void EventualETestThree() {
    edu.utep.cs5374.ltlgenerator.cp.CPUnitTests.TestCP(new edu.utep.cs5374.ltlgenerator.cp.EventualE().compute(1), "(!p0)&((!p0)U(p0))");
}