@org.androidannotations.annotations.ItemClick(value = R.id.search_detail_list_view)
protected void itemClicked(android.util.Pair<java.lang.String, at.jku.se.decisiondocu.restclient.client.model.NodeInterface> item) {
    if ((item.second) instanceof at.jku.se.decisiondocu.restclient.client.model.Document) {
        new at.jku.se.decisiondocu.activities.SearchDocumentDetailsActivity_.IntentBuilder_(this).relation(item.first).decisionId(item.second.getId()).start();
    }else {
        new at.jku.se.decisiondocu.activities.SearchNodeDetailsActivity_.IntentBuilder_(this).decisionId(item.second.getId()).start();
    }
    finish();
}