private java.util.List<java.lang.String> getAuxAppArns(java.util.Collection<com.amazonaws.devicefarm.Upload> auxUploads) {
    java.util.List<java.lang.String> auxAppArns = com.google.common.collect.Lists.newArrayList();
    if ((auxUploads == null) || ((auxUploads.size()) == 0)) {
        return auxAppArns;
    }
    for (com.amazonaws.devicefarm.Upload auxApp : auxUploads) {
        auxAppArns.add(auxApp.getArn());
    }
    return auxAppArns;
}