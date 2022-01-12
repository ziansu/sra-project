@java.lang.Override
public void onResponse(retrofit2.Call<com.illicar.redstone.common.IllicarServerResponse<java.util.ArrayList<com.illicar.redstone.common.dto.VehicleDTO>>> call, retrofit2.Response<com.illicar.redstone.common.IllicarServerResponse<java.util.ArrayList<com.illicar.redstone.common.dto.VehicleDTO>>> response) {
    java.util.ArrayList<com.illicar.redstone.common.dto.VehicleDTO> vehicleDTO = response.body().getData();
    if (vehicleDTO != null) {
        mVehicleList.addAll(vehicleDTO);
        mAdapterAccountDetailVehicleView.setData(mVehicleList);
        mAdapterAccountDetailVehicleView.updateData(mVehicleList);
        mAdapterAccountDetailVehicleView.notifyDataSetChanged();
    }
}