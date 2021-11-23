@java.lang.Override
public void onClick(android.view.View v) {
    com.example.mervesimsek.vehicleapp.common.CommonObjectManager.VehicleListSelectedRowModel = holder.vehicleViewHolder;
    showVehicleDetailActivityController(currentContext);
}