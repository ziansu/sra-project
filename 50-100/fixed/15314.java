public java.io.File prevElement() {
    if ((cnt) > 1) {
        --(cnt);
        java.lang.System.out.println(((cnt) - 1));
        return fileList.get(((cnt) - 1));
    }
    cnt = (fileList.size()) - 1;
    java.lang.System.out.println(cnt);
    return null;
}