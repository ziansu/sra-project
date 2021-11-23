@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<de.dreier.mytargets.shared.models.Arrow>> loader, java.util.List<de.dreier.mytargets.shared.models.Arrow> data) {
    setList(arrowDataSource, data, new de.dreier.mytargets.fragments.ArrowFragment.ArrowAdapter(getContext()));
}