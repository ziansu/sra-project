@org.springframework.web.bind.annotation.RequestMapping(value = "/cop/smt/lsm/listLeaderSttus.do")
public java.lang.String listLeaderSttus(@org.springframework.web.bind.annotation.ModelAttribute
aramframework.com.cop.smt.lsm.domain.LeaderSttusVO leaderSttusVO, org.springframework.ui.ModelMap model) {
    egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo paginationInfo = new egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo();
    leaderSttusVO.getSearchVO().fillPageInfo(paginationInfo);
    model.addAttribute("resultList", leaderSchdulService.selectLeaderSttusList(leaderSttusVO));
    int totCnt = leaderSchdulService.selectLeaderSttusListCnt(leaderSttusVO);
    leaderSttusVO.getSearchVO().setTotalRecordCount(totCnt);
    paginationInfo.setTotalRecordCount(totCnt);
    model.addAttribute(paginationInfo);
    return aramframework.com.cmm.util.WebUtil.adjustViewName("/cop/smt/lsm/LeaderSttusList");
}