public java.lang.String mapPath(java.lang.String path) {
    if ((mapList) == null) {
        return path;
    }
    for (int i = 0; i < (mapList.length); i++) {
        if ((mapList[i][0].equals(path)) || (((mapList[i][0]) + "/").equals(path))) {
            return mapList[i][1];
        }
    }
    return path;
}