public void bindView(ch.ralena.glossikaschedule.object.Schedule schedule, int position) {
    mSchedule = schedule;
    if ((mCurrentPosition) == position) {
        mView.setBackgroundColor(android.support.v4.content.ContextCompat.getColor(mContext, R.color.colorPrimaryLight));
    }else {
        mView.setBackgroundColor(Color.WHITE);
    }
    mLanguageName.setText(schedule.getLanguage());
    mScheduleType.setText(schedule.getTitle());
    mFlagImage.setImageResource(schedule.getLanguageType().getDrawable());
}