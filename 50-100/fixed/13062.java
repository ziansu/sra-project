@aramframework.com.cmm.annotation.IncludedInfo(name = "일지관리", order = 4060, gid = 40)
@org.springframework.web.bind.annotation.RequestMapping(value = "/cop/smt/dsm/listDiary.do")
@org.springframework.security.access.annotation.Secured(value = "ROLE_USER")
public java.lang.String listDiary(@org.springframework.web.bind.annotation.ModelAttribute
aramframework.com.cop.smt.dsm.domain.DiaryManageVO diaryManageVO, org.springframework.ui.ModelMap model) {
    egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo paginationInfo = new egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo();
    diaryManageVO.getSearchVO().fillPageInfo(paginationInfo);
    model.addAttribute("resultList", diaryManageService.selectDiaryManageList(diaryManageVO));
    int totCnt = ((java.lang.Integer) (diaryManageService.selectDiaryManageListCnt(diaryManageVO)));
    diaryManageVO.getSearchVO().setTotalRecordCount(totCnt);
    paginationInfo.setTotalRecordCount(totCnt);
    model.addAttribute(paginationInfo);
    return aramframework.com.cmm.util.WebUtil.adjustViewName("/cop/smt/dsm/DiaryList");
}