@java.lang.Override
public void onChange(io.realm.RealmResults<eu.marcocattaneo.rememberhere.business.models.ProximityPOI> element) {
    noItemsLinear.setVisibility(((element.size()) > 0 ? android.view.View.GONE : android.view.View.VISIBLE));
    if ((mAdapter) == null) {
        mAdapter = new eu.marcocattaneo.rememberhere.presentation.adapter.PoiAdapter(mActivity, element, this);
        poiList.setAdapter(mAdapter);
    }
}