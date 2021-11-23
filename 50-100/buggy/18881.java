@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<ru.sergjav.android.micexportfolio.base.classes.Securities>> loader, java.util.List<ru.sergjav.android.micexportfolio.base.classes.Securities> data) {
    java.util.ArrayList<ru.sergjav.android.micexportfolio.base.classes.Securities> securitiesArrayList = ((java.util.ArrayList<ru.sergjav.android.micexportfolio.base.classes.Securities>) (data));
    java.util.ArrayList<java.lang.String> securitiesShortNames = new java.util.ArrayList<>();
    for (ru.sergjav.android.micexportfolio.base.classes.Securities securities : securitiesArrayList) {
        securitiesShortNames.add(securities.getSecuritiesShortName());
    }
    mSpinnerAdapter.clear();
    mSpinnerAdapter.addAll(securitiesShortNames);
}