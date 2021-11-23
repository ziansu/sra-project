public cn.yxffcode.easytookit.algorithm.CharsMatcher buildNextIfAbsent() {
    if ((next) == null) {
        synchronized(next) {
            if ((next) == null) {
                next = compileNext(target, toff, tlen);
            }
        }
    }
    return this;
}