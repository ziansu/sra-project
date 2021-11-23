@org.springframework.web.bind.annotation.RequestMapping(value = "/edit")
public java.lang.String edit(@org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.String id, org.springframework.ui.ModelMap model) throws java.lang.Exception {
    try {
        model.addAttribute("e", db.getEmployee(java.lang.Integer.valueOf(id)));
        return "edit";
    } catch (java.lang.Exception e) {
        model.addAttribute("list", db.showAllEmployees());
        return "employees";
    }
}