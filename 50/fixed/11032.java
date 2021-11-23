@java.lang.Override
public java.lang.String next() {
    java.lang.String result = this.save();
    if (result.equals(BaseAction.SUCCESS)) {
        return org.cgiar.ccafs.ap.action.BaseAction.NEXT;
    }else {
        return result;
    }
}