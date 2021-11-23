private java.lang.String getStandardOptions(boolean posix, boolean c89, boolean c99, boolean c11, boolean cpp03, boolean cpp11) {
    java.lang.String standardOptions;
    standardOptions = (((((posix ? " --std=posix" : "") + (c89 ? " --std=c89" : "")) + (c99 ? " --std=c99" : "")) + (c11 ? " --std=c11" : "")) + (cpp03 ? " --std=c++03" : "")) + (cpp11 ? " --std=c++11" : "");
    return standardOptions;
}