public void error(java.lang.Throwable e, java.lang.String format, java.lang.Object... arguments) {
    error(com.xiaoleilu.hutool.StrUtil.format(format, arguments), e);
}