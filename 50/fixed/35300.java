private void buildListReport(java.lang.String substring, org.springframework.ui.Model uiModel) {
    java.util.List<net.test.model.Report> reports = reportDao.search(substring);
    uiModel.addAttribute("reports", reports);
}