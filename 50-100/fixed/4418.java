public java.lang.String mezmurOrg(java.lang.String azmach, java.lang.String teref) {
    java.lang.StringBuilder myMezmur = new java.lang.StringBuilder();
    java.lang.String divider = "\n *** \n";
    myMezmur.append(azmach);
    myMezmur.append(divider);
    teref = teref.replace("\n *** \n", "\n***\n");
    teref = teref.replace("***", "\n\n***\n");
    myMezmur.append(teref);
    return myMezmur.toString();
}