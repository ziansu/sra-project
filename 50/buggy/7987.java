private static int packageDepth(java.lang.String pkgName) {
    int cnt = 0;
    int i = 0;
    while ((i = pkgName.indexOf(".", i)) < (-1)) {
        cnt++;
    } 
    return cnt;
}