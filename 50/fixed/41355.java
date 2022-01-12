@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public java.util.List queryProjectTops() {
    java.lang.String sql = "SELECT tdu.id,tsu.name,tsu.YU_NAME employNum,tsu.DEPARTMENT_FOUR departmentFour,tsu.DEPARTMENT_FIVE departmentFive,tsu.CODE role,tsu.ROLE position, ISNULL(tdc.coin,0) score,ISNULL(tdc.experice_point,0) totalContribution  FROM T_SFM_USER tsu LEFT JOIN T_DuIsource_users tdu ON tsu.EMPLOY_ID = SUBSTRING (tdu.extern_uid,2,len(tdu.extern_uid)) LEFT JOIN T_DuIsource_Coins tdc ON tdu.ID = tdc.user_id    WHERE tsu.time='2017-06'      AND tsu.DEPARTMENT_THREE='路由器与电信以太开发管理部' AND tsu.ISHUAWEI='华为' AND tsu.DEPARTMENT_FOUR = '流控软件开发部' AND tsu.DEPARTMENT_FIVE = '模型算法开发部'";
    java.util.List t = null;
    return t;
}