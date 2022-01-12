public java.lang.String eth_call(org.ethereum.jsonrpc.CallArguments args, java.lang.String bnOrId) throws java.lang.Exception {
    if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
        org.ethereum.jsonrpc.JsonRpcImpl.logger.debug((("eth_call(" + args) + ")"));
    
    org.ethereum.vm.program.ProgramResult res = createCallTxAndExecute(args, getByJsonBlockId(bnOrId));
    java.lang.String s = org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(res.getHReturn());
    if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
        org.ethereum.jsonrpc.JsonRpcImpl.logger.debug(((("eth_call(" + args) + "): ") + s));
    
    return s;
}