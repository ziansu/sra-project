@java.lang.Override
public void onSuccess(java.util.List<com.bmob.im.demo.bean.Goal> object) {
    numberOfGoal = object.size();
    com.bmob.im.demo.bean.Tool.alert(this, ("" + (object.size())));
}