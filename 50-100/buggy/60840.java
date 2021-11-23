private void initResources() {
    android.util.Log.d(com.driveembetter.proevolutionsoftware.driveembetter.boundary.SignInActivity.TAG, "init resources");
    this.checkEmailBeforeLogIn = false;
    com.driveembetter.proevolutionsoftware.driveembetter.authentication.factoryProvider.FactoryProviders factoryProviders = new com.driveembetter.proevolutionsoftware.driveembetter.authentication.factoryProvider.FactoryProviders(this, this.handler);
    this.singletonFirebaseProvider = com.driveembetter.proevolutionsoftware.driveembetter.authentication.SingletonFirebaseProvider.getInstance(this, this.handler);
    this.baseProviderArrayList = factoryProviders.getAllProviders();
}