public java.lang.String getClassName() {
    if (((mClassList) == null) || (mClassList.isEmpty())) {
        return mClassName.isEmpty() ? null : mClassName;
    }else {
        java.lang.String class_name = mClassList.get(0);
        for (int i = 1; i < (mClassList.size()); i++) {
            class_name = "," + (mClassList.get(i));
        }
        return class_name;
    }
}