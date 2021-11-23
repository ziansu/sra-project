@java.lang.Override
public void showDailyList(java.util.List<com.example.yanghang.clipboard.ListPackage.DailyTaskList.DailyTaskData> mDailyList, com.example.yanghang.clipboard.ListPackage.ClipInfosList.ListData listData) {
    android.os.Message msg = new android.os.Message();
    android.os.Bundle data = new android.os.Bundle();
    this.dailyList = mDailyList;
    this.todayMissionList = listData;
    if (((mDailyList == null) || (listData == null)) || (mDailyList.isEmpty()))
        return ;
    
    data.putInt(com.example.yanghang.clipboard.MainFormActivity.MSG_SEARCH_DATA, com.example.yanghang.clipboard.MainFormActivity.MSG_FINISH_CHECK_DAILY_DATA);
    msg.setData(data);
    handler.sendMessage(msg);
}