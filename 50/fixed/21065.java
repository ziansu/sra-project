public void updateVehicleList() {
    vehicleList = userManager.getRegisteredUserVehicles();
    notifyDataSetChanged();
}