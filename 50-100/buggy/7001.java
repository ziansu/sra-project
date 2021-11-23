@org.springframework.web.bind.annotation.RequestMapping(value = "/getGeneratedCode", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getGeneratedCode(@org.springframework.web.bind.annotation.RequestParam(value = "name", required = true)
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam(value = "tbName", required = true)
java.lang.String tbName) throws java.lang.Exception {
    java.lang.String generatedCode = "";
    if ((name.length()) > 100) {
        return generatedCode;
    }
    sg.com.fbs.web.ui.controller.common.CodeAjaxAllowedTables tbEnum = sg.com.fbs.web.ui.controller.common.CodeAjaxAllowedTables.valueOf(tbName);
    if (tbEnum == null) {
        return generatedCode;
    }
    generatedCode = new sg.com.fbs.services.common.codegen.mgr.CodeGeneratorManagerBD().getGeneratedCode(tbEnum.getTableName(), tbName);
    return generatedCode;
}