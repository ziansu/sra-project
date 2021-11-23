@org.springframework.web.bind.annotation.RequestMapping(value = "/update", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.cidic.sdx.model.ResultModel update(@org.springframework.web.bind.annotation.RequestParam
int id, @org.springframework.web.bind.annotation.RequestParam
java.lang.String image_url, @org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.String createTime) {
    com.cidic.sdx.model.Style style = new com.cidic.sdx.model.Style();
    style.setId(id);
    style.setImageUrl(image_url);
    style.setCreateTime(new java.util.Date());
    try {
        styleServiceImpl.updateStyle(style);
        resultModel = new com.cidic.sdx.model.ResultModel();
        resultModel.setResultCode(200);
    } catch (java.lang.Exception e) {
        throw new com.cidic.sdx.exception.SdxException(500, "д�����ݳ���");
    }
    return resultModel;
}