@java.lang.Override
public void onClick(android.view.View v) {
    com.example.mervesimsek.vehicleapp.common.CommonObjectManager.Status = com.example.mervesimsek.vehicleapp.common.CommonObjectManager.OperationStatus.detail;
    com.example.mervesimsek.vehicleapp.common.CommonObjectManager.VehicleListSelectedRowModel = holder.vehicleViewHolder;
    showVehicleDetailActivityController(currentContext);
}