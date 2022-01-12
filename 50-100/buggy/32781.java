@android.support.annotation.Nullable
public java.lang.String[] getValues(@android.support.annotation.NonNull
java.lang.String name, @android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.Nullable
java.lang.String[] defValue) {
    java.lang.String[] value = defValue;
    com.tomclaw.minion.IniGroup group = getOrCreateGroup(name);
    com.tomclaw.minion.IniRecord record = group.getRecord(key);
    if (record != null) {
        value = record.getValue();
    }
    return value;
}