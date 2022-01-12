@org.springframework.web.bind.annotation.RequestMapping(value = "/cop/smt/djm/listDeptPopup.do")
public java.lang.String listDept(@org.springframework.web.bind.annotation.ModelAttribute
aramframework.com.cmm.domain.SearchVO searchVO, org.springframework.ui.ModelMap model) {
    egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo paginationInfo = new egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo();
    searchVO.fillPageInfo(paginationInfo);
    model.addAttribute("resultList", deptJobService.selectDeptList(searchVO));
    int totCnt = deptJobService.selectDeptListCnt(searchVO);
    searchVO.setTotalRecordCount(totCnt);
    paginationInfo.setTotalRecordCount(totCnt);
    model.addAttribute("paginationInfo", paginationInfo);
    return aramframework.com.cmm.util.WebUtil.adjustViewName("/cop/smt/djm/DeptListPopup");
}