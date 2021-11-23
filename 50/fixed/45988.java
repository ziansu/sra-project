@java.lang.Override
public void onNext(lt.dualpair.android.data.resource.Match match) {
    adapter.append(match);
    adapter.notifyDataSetChanged();
    publish();
}