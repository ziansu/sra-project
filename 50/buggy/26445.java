@dagger.Provides
@javax.inject.Singleton
com.codeest.geeknews.model.db.RealmHelper provideRealmHelper() {
    return new com.codeest.geeknews.model.db.RealmHelper(application);
}