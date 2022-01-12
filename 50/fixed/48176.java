@org.springframework.web.bind.annotation.RequestMapping(value = "/index")
public java.lang.String index() {
    java.io.File[] listFiles = getTypeList();
    fileTypeService.delAll();
    java.util.List<org.filebrowse.entity.FileType> initTypes = initType(listFiles);
    initFiles(initTypes);
    return "index";
}