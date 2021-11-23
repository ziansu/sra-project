@java.lang.Override
public void done(List<com.angcyo.bmob.PasswordBmob> list, cn.bmob.v3.exception.BmobException e) {
    List<java.lang.String> strings = new com.angcyo.bmob.ArrayList<>();
    if (e == null) {
        java.util.Collections.reverse(list);
        for (com.angcyo.bmob.PasswordBmob bmob : list) {
            strings.add(bmob.getPassword());
        }
    }
    listener.onFind(strings);
}