@org.springframework.web.bind.annotation.RequestMapping(value = "/api/images")
public java.util.Map handleFileUpload(@org.springframework.web.bind.annotation.RequestParam(value = "file")
org.springframework.web.multipart.MultipartFile file) {
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<>();
    java.util.Map<java.lang.String, java.lang.Object> item = new java.util.HashMap<>();
    item.put("name", file.getOriginalFilename());
    item.put("id", ("xxxxx" + (++(autoInc))));
    result.put("success", true);
    result.put("item", item);
    return result;
}