@java.lang.Override
public net.praqma.jenkins.configrotator.scm.clearcaseucm.ClearCaseUCMConfiguration clone() throws java.lang.CloneNotSupportedException {
    net.praqma.jenkins.configrotator.scm.clearcaseucm.ClearCaseUCMConfiguration n = ((net.praqma.jenkins.configrotator.scm.clearcaseucm.ClearCaseUCMConfiguration) (super.clone()));
    synchronized(n) {
        for (net.praqma.jenkins.configrotator.scm.clearcaseucm.ClearCaseUCMConfigurationComponent cc : this.list) {
            n.list.add(cc.clone());
        }
    }
    return n;
}