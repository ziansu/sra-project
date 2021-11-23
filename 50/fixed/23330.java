@java.lang.Override
public int update(cn.zhku.zhkulife.po.entity.Repair entity) throws java.lang.Exception {
    return repairMapper.updateByPrimaryKeySelective(entity);
}