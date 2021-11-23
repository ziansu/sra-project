@java.lang.Override
public void showField(casak.ru.geofencer.domain.model.Field model) {
    com.google.android.gms.maps.model.PolygonOptions fieldOptions = casak.ru.geofencer.presentation.converters.FieldConverter.convertToPresentation(model);
    com.google.android.gms.maps.model.Polygon polygon = mMapView.showPolygon(fieldOptions);
    mFields.append(model.getId(), polygon);
    casak.ru.geofencer.presentation.ui.fragment.MapPointerFragment.getPointerComponent().getMapPointerPresenter().resume();
}