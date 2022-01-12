@org.springframework.web.bind.annotation.GetMapping(value = CHART_PATH)
public org.springframework.http.ResponseEntity<com.blibli.future.vo.ChartResponse> displayChart(@org.springframework.web.bind.annotation.PathVariable
java.lang.String type, @org.springframework.web.bind.annotation.RequestParam
java.lang.String dept) throws com.blibli.future.exception.TypeNotFoundException {
    return new org.springframework.http.ResponseEntity<com.blibli.future.vo.ChartResponse>(chartService.generateChart(dept, type), org.springframework.http.HttpStatus.OK);
}