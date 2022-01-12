@org.springframework.web.bind.annotation.RequestMapping(value = "/releaseSchedule", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String releaseSchedule(@org.springframework.web.bind.annotation.RequestBody
java.lang.String inputs) {
    java.lang.System.out.println(inputs);
    com.example.ReleaseSchedule rs = new com.example.ReleaseSchedule(inputs);
    return java.lang.Long.toString(rs.getTimeGap());
}