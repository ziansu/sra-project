@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value = "/update-hrunit")
@org.springframework.web.bind.annotation.ResponseBody
public int updateHRUnit(@org.springframework.web.bind.annotation.RequestParam(value = "id")
long id, @org.springframework.web.bind.annotation.RequestParam(value = "type")
int type, @org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam(value = "listOrder")
short listOrder, @org.springframework.web.bind.annotation.RequestParam(value = "alias", required = false)
java.lang.String alias, @org.springframework.web.bind.annotation.RequestParam(value = "leader", required = false)
boolean leader, @org.springframework.web.bind.annotation.RequestParam(value = "supervisor", required = false)
boolean supervisor, @org.springframework.web.bind.annotation.RequestParam(value = "auditor", required = false)
boolean auditor, @org.springframework.web.bind.annotation.RequestParam(value = "admin", required = false)
boolean admin, @org.springframework.web.bind.annotation.RequestParam(value = "iter", required = false)
boolean iter) {
    if (type == (com.jeans.iservlet.model.hr.HRUnit.DEPARTMENT)) {
        return hrService.updateDept(id, name, alias, listOrder);
    }else
        if (type == (com.jeans.iservlet.model.hr.HRUnit.EMPLOYEE)) {
            return hrService.updateEmpl(id, name, listOrder, leader, supervisor, auditor, iter, admin);
        }else {
            return 0;
        }
    
}