@org.springframework.web.bind.annotation.RequestMapping(value = "/date_list", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> getDateList() {
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> dateList = dateService.getDateList(courseSettingService.getLastSetting());
    if (dateList.isEmpty()) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return new org.springframework.http.ResponseEntity(dateList, org.springframework.http.HttpStatus.OK);
}