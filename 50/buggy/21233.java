@org.springframework.web.bind.annotation.GetMapping(value = "/csv")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String download() {
    java.lang.String csvList = csvConverterService.convertTaskListToCsv(taskList);
    return csvList;
}