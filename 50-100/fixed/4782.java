@java.lang.Override
public void refreshPolicyChains() {
    java.util.LinkedList<Controller.PolicyChain> newChains = new java.util.LinkedList<Controller.PolicyChain>();
    for (Common.Protocol.RawPolicyChain rawChain : _currentRawChains) {
        newChains.add(generatePolicyChain(rawChain));
    }
    if (newChains.equals(_currentChains))
        return ;
    
    _currentChains = newChains;
    _dpiController.updatePolicyChains(_currentChains);
}