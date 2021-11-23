public json.JSONObject getMSAGraphJSON() {
    api.PartialOrderGraph msa = asr.getMSAGraph();
    java.lang.System.out.println(msa.toString());
    vis.POAGJson json = new vis.POAGJson(msa);
    return json.toJSON();
}