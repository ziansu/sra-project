@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    try {
        dest.writeSerializable(object);
        dest.writeSerializable(e);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}