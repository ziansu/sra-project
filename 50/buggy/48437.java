@java.lang.Override
public net.praqma.jenkins.configrotator.scm.clearcaseucm.ClearCaseUCMConfigurationComponent clone() throws java.lang.CloneNotSupportedException {
    net.praqma.jenkins.configrotator.scm.clearcaseucm.ClearCaseUCMConfigurationComponent cc = ((net.praqma.jenkins.configrotator.scm.clearcaseucm.ClearCaseUCMConfigurationComponent) (super.clone()));
    cc.baseline = baseline;
    cc.plevel = plevel;
    cc.fixed = fixed;
    return cc;
}