@java.lang.Override
public void writeToParcel(android.os.Parcel out, int i) {
    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    out.writeString(mId);
    out.writeString(mTaskId);
    out.writeString(mUserId);
    out.writeString(mDate);
    out.writeDouble(mHour);
    out.writeString(mEntryDate);
    out.writeString(mEntryUserId);
    out.writeDouble(mOldValue);
    out.writeString(mTaskTitle);
    out.writeString(mTaskArea);
}