private java.lang.Float CalcDelay(java.lang.Float[] Flow, java.lang.Float[] Cap, java.lang.Integer MsgLen, java.lang.Float TotReq) {
    java.lang.Float sum = 0.0F;
    for (java.lang.Integer u = 0; u < (Flow.length); u++) {
        sum = sum + ((Flow[u]) * (LinkDelay(Flow[u], Cap[u], MsgLen)));
    }
    return sum / TotReq;
}