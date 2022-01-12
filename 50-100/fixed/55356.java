public void startBackgroundService() {
    if ((mLocationToCheck) != null) {
        com.ray.pokemap.util.BackgroundServiceUtil.getInstance().startBackgroundPokemonService(mStaticLocation, mLocationToCheck, mLocation, STEPS, mPref.getScanInterval(), mPref.getTrackingType(), x, y, dx, dy, currentStep, customTrackingLocationPoints, currentCustomLocationArrayPos);
    }
}