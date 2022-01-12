@org.springframework.web.bind.annotation.RequestMapping(value = "/estimate", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String estimateTJob(java.lang.String tJobDefinition, java.lang.String tJobCostModel, org.springframework.ui.Model model) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    io.elastest.ece.model.CostModel costModel = gson.fromJson(tJobCostModel, io.elastest.ece.model.CostModel.class);
    java.util.ArrayList<java.lang.String> components = ((java.util.ArrayList<java.lang.String>) (costModel.getComponents().get("Services")));
    for (java.lang.String component : components) {
    }
    return "";
}