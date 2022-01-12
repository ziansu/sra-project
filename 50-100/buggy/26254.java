public java.util.List<java.util.HashMap<java.lang.String, java.lang.String>> FindEmpToMove(java.lang.String deptname, java.lang.String jobname, java.lang.String empid) {
    java.lang.String sql = "select newdept,oldjob,newjob,emp_name,emp_sex,jobtime,jobreason " + (((("from EMPINFO emp,Changeinfo ci " + "where ci.emp_number=emp.emp_number ") + "and to_date(jobtime,'YYYY-MM-DD ')>=to_date(?,'YYYY-MM-DD') ") + "and to_date(jobtime,'YYYY-MM-DD')<=to_date(?,'YYYY-MM-DD')  ") + "order by jobtime   ");
    return super.findBySQL(sql, starttime, endtime);
}