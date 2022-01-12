@java.lang.Override
public boolean accept(java.io.File pathname) {
    if (pathname.isDirectory()) {
        return true;
    }else {
        try {
            java.lang.String extension = pathname.getName().substring(((pathname.getName().lastIndexOf(".")) + 1));
            return mSet.contains(extension);
        } catch (java.lang.Exception e) {
            return false;
        }
    }
}