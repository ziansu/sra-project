@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int i) {
    dest.writeString(taskId);
    dest.writeString(name);
    dest.writeInt(groupId);
    dest.writeString(description);
    dest.writeString(status);
    dest.writeString(location);
    dest.writeInt(creatorId);
    dest.writeLong(startTime.getTime());
    dest.writeLong(endTime.getTime());
    dest.writeByteArray(img);
}