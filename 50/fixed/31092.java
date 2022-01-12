@java.lang.Override
public java.lang.Boolean call(java.lang.CharSequence username, java.lang.CharSequence pwd, java.lang.Boolean isChecked) {
    return ((!(com.alibaba.android.arouter.utils.TextUtils.isEmpty(username))) && (!(com.alibaba.android.arouter.utils.TextUtils.isEmpty(pwd)))) && isChecked;
}