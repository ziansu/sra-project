public static void inject(android.app.Fragment fragment) {
    dagger.internal.Preconditions.checkNotNull(fragment, "fragment");
    dagger.android.HasFragmentInjector hasFragmentInjector = dagger.android.AndroidInjection.findHasFragmentInjector(fragment);
    dagger.android.AndroidInjector<android.app.Fragment> fragmentInjector = hasFragmentInjector.fragmentInjector();
    dagger.internal.Preconditions.checkNotNull(fragmentInjector, "%s.fragmentInjector() returned null", hasFragmentInjector.getClass());
    fragmentInjector.inject(fragment);
}