public static void inject(android.app.Fragment fragment) {
    dagger.internal.Preconditions.checkNotNull(fragment, "fragment");
    dagger.android.HasFragmentInjector hasFragmentInjector = dagger.android.AndroidInjection.findHasFragmentInjector(fragment);
    android.util.Log.d(dagger.android.AndroidInjection.TAG, java.lang.String.format("An injector for %s was found in %s", fragment.getClass().getCanonicalName(), hasFragmentInjector.getClass().getCanonicalName()));
    dagger.android.AndroidInjector<android.app.Fragment> fragmentInjector = hasFragmentInjector.fragmentInjector();
    dagger.internal.Preconditions.checkNotNull(fragmentInjector, "%s.fragmentInjector() returned null", hasFragmentInjector.getClass().getCanonicalName());
    fragmentInjector.inject(fragment);
}