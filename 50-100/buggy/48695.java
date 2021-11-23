@java.lang.Override
public com.tdd.katas.microservices.vehicleservice.service.CompositeVehicleData getVehicleData(java.lang.String vin) {
    com.tdd.katas.microservices.vehicleservice.service.VehicleData vehicleData = vehicleRepository.getVehicleData(vin);
    com.tdd.katas.microservices.vehicleservice.service.CustomerData customerData = customerRestServiceProxy.getCustomerData(vehicleData.getCustomerId());
    com.tdd.katas.microservices.vehicleservice.service.CarData carData = carRestServiceProxy.getCarData(vin);
    com.tdd.katas.microservices.vehicleservice.service.PartData[] partDataList = partRestServiceProxy.getPartData(vin);
    com.tdd.katas.microservices.vehicleservice.service.CompositeVehicleData compositeVehicleData = new com.tdd.katas.microservices.vehicleservice.service.CompositeVehicleData(customerData, carData, partDataList);
    return compositeVehicleData;
}