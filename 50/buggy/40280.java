public void check(org.thingml.xtext.thingML.ThingMLModel model, org.thingml.compilers.checker.Checker checker) {
    for (org.thingml.xtext.thingML.Configuration c : org.thingml.xtext.constraints.ThingMLHelpers.allConfigurations(model)) {
        checker.do_check(c);
    }
}