@org.junit.Test
public void RemoveCarTest() {
    org.mockito.Mockito.when(classMapper.mapTo(any(cz.muni.fi.pa165.carpark.api.dto.CarDTO.class), eq(cz.muni.fi.pa165.carpark.persistence.entity.Car.class))).thenReturn(car);
    carFacade.removeCar(carDTO);
    org.mockito.Mockito.verify(carService).deleteCar(car);
}