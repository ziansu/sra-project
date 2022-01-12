@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.rashwan.reactive_popular_movies.PopularMoviesApplication.component = com.rashwan.reactive_popular_movies.DI.DaggerApplicationComponent.builder().applicationModule(new com.rashwan.reactive_popular_movies.DI.ApplicationModule(this)).build();
    com.rashwan.reactive_popular_movies.PopularMoviesApplication.component.inject(this);
    timber.log.Timber.plant(new timber.log.Timber.DebugTree() {
        @java.lang.Override
        protected java.lang.String createStackElementTag(java.lang.StackTraceElement element) {
            return ((super.createStackElementTag(element)) + ':') + (element.getLineNumber());
        }
    });
    timber.log.Timber.d("Hello!");
    java.util.concurrent.atomic.AtomicInteger queries = new java.util.concurrent.atomic.AtomicInteger();
}