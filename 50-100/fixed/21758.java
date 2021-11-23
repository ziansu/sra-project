@org.junit.Test
public void Returns_500_when_service_error() throws java.lang.Exception {
    java.lang.String ANY_VIN = "ANY_VIN";
    org.mockito.BDDMockito.given(vehicleDataService.getVehicleData(ANY_VIN)).willThrow(new java.lang.RuntimeException("Database is not ready"));
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get(((VehicleDataController.URL_MAPPING) + "/{vinCode}"), ANY_VIN)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isInternalServerError());
    org.mockito.Mockito.verify(vehicleDataService).getVehicleData(ANY_VIN);
}