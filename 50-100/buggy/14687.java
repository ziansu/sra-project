public json.JSONObject getMSAGraphJSON() {
    api.PartialOrderGraph msa;
    java.lang.System.out.println(((asrJoint) == null));
    java.lang.System.out.println(((asrMarginal) == null));
    if (inferenceType.equalsIgnoreCase("joint"))
        msa = asrJoint.getMSAGraph();
    else
        msa = asrMarginal.getMSAGraph();
    
    vis.POAGJson json = new vis.POAGJson(msa);
    return json.toJSON();
}