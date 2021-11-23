public void receive(java.util.Map<java.lang.String, java.lang.String> result) {
    int in = java.lang.Integer.parseInt(result.get("rx-bits-per-second"));
    int out = java.lang.Integer.parseInt(result.get("tx-bits-per-second"));
    traffic = in + out;
    java.lang.System.out.println((((((parentIdentity) + ": Total traffic on ") + (label)) + ": ") + (traffic)));
    aggregator.update(traffic);
}