@org.junit.Test
public void old_mode_nrtm_test() {
    net.ripe.db.whois.api.changedphase3.Scenario.Builder.given(net.ripe.db.whois.api.changedphase3.Scenario.Mode.OLD_MODE, net.ripe.db.whois.api.changedphase3.Scenario.ObjectStatus.OBJ_EXISTS_WITH_CHANGED).when(net.ripe.db.whois.api.changedphase3.Scenario.Protocol.NRTM___, net.ripe.db.whois.api.changedphase3.Scenario.Method.EVENT_, net.ripe.db.whois.api.changedphase3.Scenario.Req.NOT_APPLIC__).then(net.ripe.db.whois.api.changedphase3.Scenario.Result.SUCCESS, net.ripe.db.whois.api.changedphase3.Scenario.ObjectStatus.OBJ_EXISTS_WITH_CHANGED).run();
    net.ripe.db.whois.api.changedphase3.Scenario.Builder.given(net.ripe.db.whois.api.changedphase3.Scenario.Mode.OLD_MODE, net.ripe.db.whois.api.changedphase3.Scenario.ObjectStatus.OBJ_EXISTS_NO_CHANGED__).when(net.ripe.db.whois.api.changedphase3.Scenario.Protocol.NRTM___, net.ripe.db.whois.api.changedphase3.Scenario.Method.EVENT_, net.ripe.db.whois.api.changedphase3.Scenario.Req.NOT_APPLIC__).then(net.ripe.db.whois.api.changedphase3.Scenario.Result.SUCCESS, net.ripe.db.whois.api.changedphase3.Scenario.ObjectStatus.OBJ_EXISTS_NO_CHANGED__).run();
}