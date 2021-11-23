public void loadAndPrependMatch(android.content.Context context, java.lang.Long matchId) {
    new lt.dualpair.android.data.manager.MatchDataManager(context).match(matchId).subscribeOn(rx.schedulers.Schedulers.newThread()).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new lt.dualpair.android.data.EmptySubscriber<lt.dualpair.android.data.resource.Match>() {
        @java.lang.Override
        public void onNext(lt.dualpair.android.data.resource.Match match) {
            adapter.prepend(match);
            adapter.notifyDataSetChanged();
        }
    });
}