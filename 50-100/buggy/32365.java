@java.lang.Override
public java.util.List<prada.lab.android.pingo.model.PingoPlace> apply(java.util.List<prada.lab.android.pingo.model.PingoPlace> places) throws java.lang.Exception {
    java.util.List<prada.lab.android.pingo.model.PingoPlace> filtered = new java.util.ArrayList<>();
    for (prada.lab.android.pingo.model.PingoPlace place : places) {
        if ((place.getCategoryType()) == category) {
            filtered.add(place);
        }
    }
    return filtered;
}