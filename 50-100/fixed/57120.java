@org.springframework.web.bind.annotation.RequestMapping(value = "/list", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.data.domain.Page<java.util.Map<java.lang.String, java.lang.Object>> list(org.springframework.data.domain.Pageable pageable, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    java.lang.String sid = request.getParameter("sid");
    java.lang.String url = com.c3.stp.ui.common.Const.MOBILE_INTRODUCTION;
    com.c3.base.model.entity.sm.C3SmResourceMenu menu = resourceService.getMenuByUrl(url, com.c3.base.i18n.util.I18nUtil.locale());
    org.springframework.data.domain.Page<java.util.Map<java.lang.String, java.lang.Object>> page = articleService.queryArticleByScene(menu.getId().toString(), null, sid, pageable);
    return page;
}