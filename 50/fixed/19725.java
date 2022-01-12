@java.lang.Override
public uk.co.nickthecoder.wrkfoo.Tool<?> splitTool() {
    if (isRerunnable()) {
        return this.duplicate();
    }else {
        return new uk.co.nickthecoder.wrkfoo.tool.Home();
    }
}