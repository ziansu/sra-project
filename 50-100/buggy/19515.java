@org.junit.Test
public void Returns_404_for_non_existent_vin_code() throws java.lang.Exception {
    org.mockito.BDDMockito.given(vehicleDataService.getVehicleData(org.mockito.Matchers.any())).willReturn(null);
    java.lang.String NON_EXISTENT_VIN = "NON_EXISTENT_VIN";
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get(((VehicleDataController.URL_MAPPING) + "/{vinCode}"), NON_EXISTENT_VIN)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isNotFound());
    org.mockito.Mockito.verify(vehicleDataService).getVehicleData(org.mockito.Matchers.any());
}