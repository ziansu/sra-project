public static double EdTitle(it.unipi.di.acube.batframework.utils.WikipediaApiInterface wikiApi, java.lang.String e, java.lang.String m) {
    double edTit = 0.0;
    int ID;
    try {
        ID = wikiApi.getIdByTitle(e);
        if (ID != (-1)) {
            java.lang.String wikiTitle = wikiApi.getTitlebyId(ID);
            edTit = annotatorstub.utils.SMAPHFeatures.editDistance(wikiTitle, e);
        }
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
    return edTit;
}