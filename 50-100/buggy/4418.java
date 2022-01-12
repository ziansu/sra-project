public java.lang.String mezmurOrg(java.lang.String azmach, java.lang.String teref) {
    java.lang.StringBuffer myMezmur = new java.lang.StringBuffer();
    java.lang.String divider = "\n *** \n";
    myMezmur.append(azmach);
    myMezmur.append(divider);
    teref = teref.replace("\n *** \n", "\n***\n");
    teref = teref.replace("***", "\n\n***\n");
    myMezmur.append(teref);
    return myMezmur.toString();
}