@java.lang.Override
protected void collectConParameters() {
    collectConFieldContextParameters(isCurrentHadoopVersionSupportYarn());
    collectAuthFieldContextParameters(kerberosBtn.getSelection());
    collectKeyTabContextParameters(((kerberosBtn.getSelection()) && (keytabBtn.getSelection())));
    collectClouderaNavigatorFieldContextParameters(useClouderaNaviBtn.getSelection());
}