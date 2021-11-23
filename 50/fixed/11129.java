@java.lang.Override
public <Builder extends org.elasticsearch.action.search.SearchRequestBuilder> Builder buildPage(Builder builder) throws java.lang.Exception {
    return canBuildPage() ? this.internalBuildPage(builder) : builder;
}