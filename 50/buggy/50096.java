@java.lang.Override
public void convert(com.alphabet.alphabetsdklib.uitls.ViewHolder viewHolder, com.alphabet.alphabetsdk.MainActivity.ActivityBean activityBean) {
    viewHolder.setText(R.id.title_tv, activityBean.getTitle()).setText(R.id.content_tv, activityBean.getDesc());
}