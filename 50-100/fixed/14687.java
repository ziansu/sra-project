public json.JSONObject getMSAGraphJSON() {
    api.PartialOrderGraph msa;
    if (inferenceType.equalsIgnoreCase("joint"))
        msa = asrJoint.getMSAGraph();
    else
        msa = asrMarginal.getMSAGraph();
    
    vis.POAGJson json = new vis.POAGJson(msa);
    return json.toJSON();
}