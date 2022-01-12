@java.lang.Override
public boolean isTrue(burlap.oomdp.core.states.State s, java.lang.String[] params) {
    commands.amdp.tools.parse.CleanupL2Parser parser = new commands.amdp.tools.parse.CleanupL2Parser(this.domain);
    burlap.oomdp.core.objects.ObjectInstance o = s.getObject(params[0]);
    burlap.oomdp.core.objects.ObjectInstance currRegion = s.getObject(o.getStringValForAttribute(CleanupL1AMDPDomain.ATT_IN_REGION));
    burlap.oomdp.core.objects.ObjectInstance region = s.getObject(params[1]);
    if (currRegion == null) {
        return false;
    }else {
        return currRegion.valueEquals(region);
    }
}