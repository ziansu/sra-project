@java.lang.Override
public void cleanup(org.expath.servlex.tools.Auditor auditor) throws org.expath.servlex.ServlexException {
    auditor.cleanup("calabash pipleline, close the runtime object");
    if ((myRuntime) != null) {
        myRuntime.close();
        myRuntime = null;
    }
}