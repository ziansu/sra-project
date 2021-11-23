public void getEventListFeed(rocks.itsnotrocketscience.bejay.managers.RetrofitManager.EventListListener listener) {
    rocks.itsnotrocketscience.bejay.api.retrofit.GetEvents events = restAdapter.create(rocks.itsnotrocketscience.bejay.api.retrofit.GetEvents.class);
    events.getFeed("events", new retrofit.Callback<java.util.ArrayList<rocks.itsnotrocketscience.bejay.models.Event>>() {
        @java.lang.Override
        public void success(java.util.ArrayList<rocks.itsnotrocketscience.bejay.models.Event> eventList, retrofit.client.Response response) {
            listener.onEventFeedLoaded(eventList, null);
        }

        @java.lang.Override
        public void failure(retrofit.RetrofitError error) {
            listener.onEventFeedLoaded(null, error);
        }
    });
}