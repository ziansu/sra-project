@java.lang.Override
public rx.Observable<com.winsonchiu.reader.data.reddit.Listing> call(com.winsonchiu.reader.data.reddit.Listing listing) {
    if ((!(listing.getChildren().isEmpty())) && (!((listing.getChildren().get(0)) instanceof com.winsonchiu.reader.data.reddit.Link))) {
        return rx.Observable.error(new java.lang.Exception());
    }
    return rx.Observable.just(listing);
}