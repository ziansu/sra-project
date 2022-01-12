@org.springframework.web.bind.annotation.RequestMapping(value = { "sltMTechDetailListAjax" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.abilists.bean.para.profile.MTechDetailListAjax sltMTechDetailListAjax(@org.springframework.web.bind.annotation.RequestBody
com.abilists.bean.para.admin.SltMTechDetailPara sltMTechDetailPara, javax.servlet.http.HttpSession session) throws java.lang.Exception {
    this.handleSessionInfo(session, sltMTechDetailPara);
    sltMTechDetailPara.setMlCode(sltMTechDetailPara.getLang());
    java.util.List<com.abilists.bean.model.MTechDetailModel> mTechDetailList = adminMasterService.sltMTechDetailList(sltMTechDetailPara);
    logger.info(("mTechDetailList size = " + (mTechDetailList.size())));
    com.abilists.bean.para.profile.MTechDetailListAjax mTechDetailListAjax = new com.abilists.bean.para.profile.MTechDetailListAjax();
    mTechDetailListAjax.setmTechDetailList(mTechDetailList);
    return mTechDetailListAjax;
}