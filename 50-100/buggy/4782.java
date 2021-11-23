@java.lang.Override
public void refreshPolicyChains() {
    java.util.LinkedList<Controller.PolicyChain> newChains = new java.util.LinkedList<Controller.PolicyChain>();
    for (Common.Protocol.RawPolicyChain rawChain : _currentRawChains) {
        _currentChains.add(generatePolicyChain(rawChain));
    }
    if (((_currentChains) != null) && (newChains.equals(_currentChains)))
        return ;
    
    _currentChains = newChains;
    _dpiController.updatePolicyChains(_currentChains);
}