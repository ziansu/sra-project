public boolean cleanProblemJob() {
    java.lang.String sql = "UPDATE `tbl_custom_report_job` set `Status`=? where `Status`=? and DATE_FORMAT(CreatedAt,'%Y-%m-%d') < DATE_FORMAT(NOW(),'%Y-%m-%d')";
    try {
        dbBean.setPrepareStatement(sql);
        dbBean.setInt(1, Constants.JOB_STATUS_FAILED);
        dbBean.setInt(2, Constants.JOB_STATUS_STARTJOB);
        if ((dbBean.executeUpdate()) > 0) {
            return true;
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return false;
}