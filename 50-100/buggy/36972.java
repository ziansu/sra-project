void logObjects() {
    org.mym.prettylog.data.User.Cat tom = new org.mym.prettylog.data.User.Cat("Tom", "Blue");
    org.mym.prettylog.data.User.Cat jerry = new org.mym.prettylog.data.User.Cat("Jerry", "brown");
    java.util.List<org.mym.prettylog.data.User.Cat> cats = new java.util.ArrayList<>();
    java.util.Collections.addAll(cats, tom, jerry);
    org.mym.prettylog.data.User user = new org.mym.prettylog.data.User("Alice", 23, cats);
    org.mym.plog.PLog.objects(cats);
    org.mym.plog.PLog.objects(user);
    org.mym.plog.PLog.objects("RxJava", "RxAndroid", "RxBinding", "RxBus");
}