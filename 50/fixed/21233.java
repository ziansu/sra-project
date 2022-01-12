@org.springframework.web.bind.annotation.GetMapping(value = "/csv")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String download() {
    return csvConverterService.convertTaskListToCsv(taskList);
}