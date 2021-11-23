@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.Exception.class)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
@org.springframework.web.bind.annotation.ResponseBody
public com.alibaba.fastjson.JSONObject handleException(java.lang.Exception ex) {
    com.sdll18.leetcode.spider.controller.exception.ExceptionController.logger.error(ex.getMessage(), ex);
    return com.sdll18.leetcode.spider.util.FastJsonUtil.error(Code.ERROR_INTERNAL, "internal error");
}