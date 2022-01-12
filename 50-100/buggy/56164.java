@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.danielflower.apprunner.router.mgmt.Runner runner = ((com.danielflower.apprunner.router.mgmt.Runner) (o));
    return (((maxApps) == (runner.maxApps)) && (id.equals(runner.id))) && (url.equals(runner.url));
}