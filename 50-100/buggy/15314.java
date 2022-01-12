public java.io.File prevElement() {
    if ((cnt) >= 0) {
        --(cnt);
        java.lang.System.out.println(cnt);
        return fileList.get(cnt);
    }
    cnt = (fileList.size()) - 1;
    java.lang.System.out.println(cnt);
    return null;
}