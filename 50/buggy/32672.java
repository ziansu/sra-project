@org.springframework.web.bind.annotation.GetMapping(value = CHART_PATH)
public org.springframework.http.ResponseEntity<com.blibli.future.vo.ChartResponse> displayChart(@org.springframework.web.bind.annotation.PathVariable
java.lang.String dept, @org.springframework.web.bind.annotation.PathVariable
java.lang.String type) throws com.blibli.future.exception.TypeNotFoundException {
    return new org.springframework.http.ResponseEntity<com.blibli.future.vo.ChartResponse>(chartService.generateChart(dept, type), org.springframework.http.HttpStatus.OK);
}