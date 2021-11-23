@java.lang.Override
public uk.co.hmtt.gym.cukes.acceptance.entities.UserActivityEntity mapRow(java.sql.ResultSet resultSet, int i) throws java.sql.SQLException {
    return uk.co.hmtt.gym.cukes.acceptance.entities.UserActivityEntity.buildActivityEntity(resultSet.getInt("userId"), resultSet.getInt("activityId"));
}