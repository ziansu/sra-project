@java.lang.Override
public void onResult(se.sics.ktoolbox.networkmngr.hooks.NetworkResult result) {
    this.networkResult = result;
    connect(networkResult.getNetwork(), network, new se.sics.p2ptoolbox.util.truefilters.SourcePortFilter(req.self.getPort(), false));
    se.sics.ktoolbox.networkmngr.events.Bind.Response resp = req.answer(id, portBindingResult.boundPort);
    trigger(resp, manager);
}