@java.lang.Override
public net.praqma.jenkins.configrotator.scm.git.GitConfiguration clone() throws java.lang.CloneNotSupportedException {
    final net.praqma.jenkins.configrotator.scm.git.GitConfiguration n = ((net.praqma.jenkins.configrotator.scm.git.GitConfiguration) (super.clone()));
    synchronized(n) {
        for (net.praqma.jenkins.configrotator.scm.git.GitConfigurationComponent gc : this.list) {
            n.list.add(((net.praqma.jenkins.configrotator.scm.git.GitConfigurationComponent) (gc.clone())));
        }
    }
    return n;
}