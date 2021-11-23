public static void saveFarmer(com.owsega.hellotractorsample.BaseActivity context, com.owsega.hellotractorsample.model.FarmerEntity farmer) {
    android.util.Log.e("seyi", "prepping to save farmer");
    com.owsega.hellotractorsample.model.FarmerEntity.getEvents(context).save(farmer, new com.kinvey.java.core.KinveyClientCallback<com.owsega.hellotractorsample.model.FarmerEntity>() {
        @java.lang.Override
        public void onSuccess(com.owsega.hellotractorsample.model.FarmerEntity farmerEntity) {
            android.util.Log.e("seyi", "success to save farmer");
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable throwable) {
            android.util.Log.e("seyi", "failed to save farmer");
        }
    });
}