@java.lang.Override
public void run() {
    if (!(globalreplace.GlobalReplace.activated)) {
        if (!(this.sanityCheck())) {
            return ;
        }
        globalreplace.GlobalReplace.BUTTON.setText("Stop");
        globalreplace.GlobalReplace.negateActivated();
        this.doJob();
        globalreplace.GlobalReplace.wiki = globalreplace.GlobalReplace.wiki.getWiki("commons.wikimedia.org");
        globalreplace.GlobalReplace.BUTTON.setText("Start");
    }else {
        globalreplace.GlobalReplace.BUTTON.setEnabled(false);
        globalreplace.GlobalReplace.negateActivated();
    }
}