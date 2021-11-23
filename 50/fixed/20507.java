public io.kuzzle.sdk.core.KuzzleDataCollection dataCollectionFactory(@android.support.annotation.NonNull
final java.lang.String collection) {
    this.isValid();
    if ((this.defaultIndex) == null) {
        throw new java.lang.IllegalArgumentException("KuzzleDataCollection: unable to create a new data collection object: no index specified");
    }
    return this.dataCollectionFactory(collection, this.defaultIndex);
}