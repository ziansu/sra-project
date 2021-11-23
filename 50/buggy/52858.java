public java.util.List<egovframework.rte.psl.dataaccess.util.EgovMap> selectOnlinePollManageList(aramframework.com.uss.olp.opm.domain.OnlinePollManageVO onlinePollManageVO) {
    return onlinePollManageMapper.selectOnlinePollManageList(onlinePollManageVO.getSearchVO());
}