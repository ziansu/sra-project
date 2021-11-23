private org.rbdc.sra.objects.QuestionSet addResponseSet(org.rbdc.sra.objects.QuestionSet qs) {
    com.google.gson.Gson gson = new com.google.gson.GsonBuilder().create();
    java.lang.String json = gson.toJson(qs);
    org.rbdc.sra.objects.QuestionSet clonedQS = gson.fromJson(json, org.rbdc.sra.objects.QuestionSet.class);
    responseSets.add(clonedQS);
    populateListItems();
    responseSetAdapter.notifyDataSetChanged();
    return clonedQS;
}