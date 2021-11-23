@org.springframework.web.bind.annotation.RequestMapping(value = "/employee", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<com.myCompany.objects.Employee> createEmployee(@org.springframework.web.bind.annotation.RequestBody
@javax.validation.Valid
com.myCompany.objects.Employee employee) {
    com.myCompany.objects.Employee emp = employeeService.createEmployee(employee);
    if (emp != null) {
        if (employeeService.employeeExists(emp.id)) {
            return new org.springframework.http.ResponseEntity<com.myCompany.objects.Employee>(org.springframework.http.HttpStatus.CONFLICT);
        }else
            return new org.springframework.http.ResponseEntity<com.myCompany.objects.Employee>(emp, org.springframework.http.HttpStatus.CREATED);
        
    }else
        return new org.springframework.http.ResponseEntity<com.myCompany.objects.Employee>(org.springframework.http.HttpStatus.CONFLICT);
    
}