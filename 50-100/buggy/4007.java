public java.util.List<vo.ReportVO> getMergeReport(java.lang.String taskname) {
    java.util.List<vo.ReportVO> result = new java.util.ArrayList<>();
    java.util.List<po.ReportPO> list = null;
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