public com.abm.pos.com.abm.pos.dto.reports.YearlyListDto getYearlyTransactionDetails(java.lang.String startDate, java.lang.String endDate) {
    java.util.List<com.abm.pos.com.abm.pos.dto.reports.YearlyListDto> yearOfMonth = new java.util.ArrayList<>();
    com.abm.pos.com.abm.pos.bl.ClosingDetailsManager.YearlyMapper yearlyMapper = new com.abm.pos.com.abm.pos.bl.ClosingDetailsManager.YearlyMapper();
    try {
        yearOfMonth = jdbcTemplate.query(sqlQueries.getYearlyTransaction, yearlyMapper);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
    return yearlyMapper.yearlyListDto;
}