public java.util.List getOutsourceContract(java.util.Map input) {
    java.util.List<outsource.OutsourceBean> result = new java.util.ArrayList<outsource.OutsourceBean>();
    com.ibatis.sqlmap.client.SqlMapClient ibatis = utils.IbatisHelper.getSqlMapInstance();
    try {
        result = ((java.util.List<outsource.OutsourceBean>) (ibatis.queryForList("outsource.getOutsourceContract", input)));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return result;
}