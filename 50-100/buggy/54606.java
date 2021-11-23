private java.util.ArrayList getListData() {
    java.util.ArrayList<projet.istic.fr.firedrone.model.MoyenInterventionItem> results = new java.util.ArrayList<projet.istic.fr.firedrone.model.MoyenInterventionItem>();
    java.lang.String[] values = getResources().getStringArray(R.array.moyens);
    projet.istic.fr.firedrone.model.MoyenInterventionItem newsData;
    for (java.lang.String value : values) {
        newsData = new projet.istic.fr.firedrone.model.MoyenInterventionItem();
        java.lang.System.out.println(value);
        newsData.setName(value);
        newsData.setQuantity(2);
        results.add(newsData);
    }
    return results;
}