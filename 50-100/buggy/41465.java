@java.lang.Override
public java.lang.String methodOne(java.lang.String param1, int param2) throws accessor_one.SomeException112 {
    java.lang.Object[] params = new java.lang.Object[]{ param1 , param2 };
    java.lang.Object result = rawObject.getKommModul().send(this.rawObject.getObjectReference(), "methodOne", params);
    if (result instanceof accessor_one.SomeException112) {
        throw ((accessor_one.SomeException112) (result));
    }else {
        return ((java.lang.String) (result));
    }
}