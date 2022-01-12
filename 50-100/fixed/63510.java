@java.lang.Override
java.lang.String[] findTime(java.lang.String file) {
    int begin = file.indexOf("(время эфира)", 0);
    java.lang.String[] output = new java.lang.String[]{ "" , "" };
    output[0] = file.substring((begin - 17), (begin - 9)).trim();
    output[1] = file.substring((begin - 8), begin).trim();
    return output;
}