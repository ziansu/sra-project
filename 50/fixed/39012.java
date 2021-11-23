@java.lang.Override
public edu.fzu.progds.superasso.dto.ActivityProfile getActivityInfo(int actId) {
    edu.fzu.progds.superasso.domain.Activity activity = activityDao.get(edu.fzu.progds.superasso.domain.Activity.class, actId);
    edu.fzu.progds.superasso.dto.ActivityProfile activityProfile = new edu.fzu.progds.superasso.dto.ActivityProfile(activity);
    return activityProfile;
}