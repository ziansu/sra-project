@com.wordnik.swagger.annotations.ApiOperation(httpMethod = "POST", value = "文件上传", response = java.lang.String.class)
@com.lucifer.controller.RequestMapping(value = "/upload", method = RequestMethod.POST)
@com.lucifer.controller.ResponseBody
public com.lucifer.utils.Result upload(@com.lucifer.controller.RequestParam(value = "file")
org.springframework.web.multipart.MultipartFile file) {
    try {
        java.lang.String uploadUrl;
        uploadUrl = qiniuCloudService.simpleUploadWithoutKey(file);
        return com.lucifer.utils.Result.ok(uploadUrl);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return com.lucifer.utils.Result.fail(e.getMessage());
    }
}