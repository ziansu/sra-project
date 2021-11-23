@java.lang.Override
public void onSuccess(com.owsega.hellotractorsample.model.FarmerEntity[] results) {
    com.owsega.hellotractorsample.model.Farmer.saveFarmers(results);
}