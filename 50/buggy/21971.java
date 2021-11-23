@org.kohsuke.stapler.export.Exported
public java.lang.String getNeedDiffTool() {
    if ((getExpectedValue()) == (getActualValue())) {
        return "";
    }else {
        return "true";
    }
}