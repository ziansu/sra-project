public void switchPower() {
    if ((de.tf.magiclamp.HomeFragment.lampConfig) == null) {
        return ;
    }
    de.tf.magiclamp.HomeFragment.lampConfig.setActive((!(de.tf.magiclamp.HomeFragment.lampConfig.getActive())));
    de.tf.magiclamp.HomeFragment.service.setConfig(de.tf.magiclamp.HomeFragment.lampConfig, new retrofit.Callback<de.tf.magiclamp.model.LampConfig>() {
        @java.lang.Override
        public void success(de.tf.magiclamp.model.LampConfig aBoolean, retrofit.client.Response response) {
            android.util.Log.d(TAG, "setConfig() called");
        }

        @java.lang.Override
        public void failure(retrofit.RetrofitError error) {
            android.util.Log.d(TAG, ("setConfig() failed " + error));
        }
    });
}