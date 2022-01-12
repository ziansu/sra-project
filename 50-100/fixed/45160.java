@java.lang.Override
public void writeToParcel(android.os.Parcel out, int i) {
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