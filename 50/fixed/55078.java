public void warn(java.lang.Throwable e, java.lang.String format, java.lang.Object... arguments) {
    warn(com.xiaoleilu.hutool.StrUtil.format(format, arguments), e);
}