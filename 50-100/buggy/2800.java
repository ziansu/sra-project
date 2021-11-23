public java.io.File[] filterHiddenFiles(java.io.File[] files) {
    java.util.List<java.io.File> ret = new java.util.ArrayList<>();
    if ((files.length) > 0) {
        for (java.io.File file : files) {
            if (!(file.isHidden())) {
                if (!(ret.contains(file))) {
                    ret.add(file);
                }
            }
        }
    }
    return ret.toArray(new java.io.File[ret.size()]);
}