@java.lang.Override
public void call(Subscriber<? extends com.joe.holi.data.model.AccuLocation> subscriber) {
    List<com.joe.holi.data.model.AccuLocation> accuLocations = new com.google.gson.Gson().fromJson(s, new TypeToken<List<com.joe.holi.data.model.AccuLocation>>() {    }.getType());
    subscriber.onNext(accuLocations.get(0));
    subscriber.onCompleted();
}