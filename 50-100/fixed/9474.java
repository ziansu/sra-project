public void setup() {
    if ((this) == (lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.APPROACH.NonStandardSPARQL)) {
        lupos.sparql1_1.operatorgraph.ServiceApproaches.setNonStandardSPARQLBitVectorJoin(true);
    }else {
        lupos.sparql1_1.operatorgraph.ServiceApproaches.setNonStandardSPARQLBitVectorJoin(false);
        if ((this) == (lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.APPROACH.Value)) {
            lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.approachClass = lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.SemiJoinToStringHelper.class;
        }else
            if ((this) == (lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.APPROACH.ValueSubstring)) {
                lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.approachClass = lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.SubstringValueToStringHelper.class;
            }else {
                lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.approachClass = lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.BitVectorJoinToStringHelper.class;
                lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.hashFunction = lupos.engine.operators.singleinput.federated.FederatedQueryBitVectorJoin.HASHFUNCTION.values()[this.ordinal()];
            }
        
    }
}