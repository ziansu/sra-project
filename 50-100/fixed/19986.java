public static void saveFarmer(com.owsega.hellotractorsample.BaseActivity context, com.owsega.hellotractorsample.model.FarmerEntity farmer) {
    com.owsega.hellotractorsample.model.FarmerEntity.getEvents(context).save(farmer, new com.kinvey.java.core.KinveyClientCallback<com.owsega.hellotractorsample.model.FarmerEntity>() {
        @java.lang.Override
        public void onSuccess(com.owsega.hellotractorsample.model.FarmerEntity farmerEntity) {
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable throwable) {
        }
    });
}