@javax.ws.rs.GET
public java.util.List<org.sanelib.ils.api.dto.holiday.HolidayDto> getAllHolidayDtos() throws java.lang.Exception {
    java.util.List<org.sanelib.ils.api.dto.holiday.HolidayDto> dtos = new java.util.ArrayList<>();
    org.sanelib.ils.api.dto.holiday.HolidayDto holidayDto = new org.sanelib.ils.api.dto.holiday.HolidayDto();
    holidayDto.setLibraryId("1");
    holidayDto.setFiscalYearId("20152016");
    holidayDto.setStartDate("2016/02/09");
    holidayDto.setEndDate("2016/02/29");
    holidayDto.setHolidayType(org.sanelib.ils.core.enums.HolidayType.getByName("Specific"));
    holidayDto.setNote(null);
    dtos.add(holidayDto);
    return dtos;
}