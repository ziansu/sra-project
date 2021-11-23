@org.springframework.web.bind.annotation.RequestMapping(value = "/index2")
public java.lang.String index2() {
    java.io.File[] listFiles = getTypeList();
    previewFileService.delAll();
    fileTypeService.delAll();
    java.util.List<org.filebrowse.entity.FileType> initTypes = initType(listFiles);
    initFiles(initTypes);
    return "index2";
}