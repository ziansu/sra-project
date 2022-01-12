public java.util.List<vo.ReportVO> getMergeReport(java.lang.String taskname) {
    java.util.List<vo.ReportVO> result = new java.util.ArrayList<vo.ReportVO>();
    java.util.List<po.ReportPO> list = new java.util.ArrayList<po.ReportPO>();
    try {
        list = reportDataService.getMergeReport(taskname);
    } catch (java.lang.ClassNotFoundException | java.sql.SQLException e) {
        e.printStackTrace();
    }
    for (po.ReportPO po : list) {
        vo.ReportVO vo = new vo.ReportVO(po);
        result.add(vo);
    }
    return result;
}