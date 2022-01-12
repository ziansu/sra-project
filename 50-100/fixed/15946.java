public java.lang.String eth_call(org.ethereum.jsonrpc.CallArguments args, java.lang.String bnOrId) throws java.lang.Exception {
    java.lang.String s = null;
    try {
        org.ethereum.vm.program.ProgramResult res = createCallTxAndExecute(args, getByJsonBlockId(bnOrId));
        return s = org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(res.getHReturn());
    } finally {
        if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
            org.ethereum.jsonrpc.JsonRpcImpl.logger.debug(((("eth_call(" + args) + "): ") + s));
        
    }
}