@java.lang.Override
public java.util.List<java.lang.String> getCommand() {
    mCommand.clear();
    for (java.lang.String option : mOptions.split(" ")) {
        for (java.lang.String option2 : option.split(se.trixon.jota.shared.task.OPT_SEPARATOR)) {
            if (org.apache.commons.lang3.StringUtils.isNotBlank(option2)) {
                add(option2);
            }
        }
    }
    if ((mManualFileUsed) && (org.apache.commons.lang3.StringUtils.isNotBlank(mManualFilePath))) {
        add(("--exclude-from=" + (mManualFilePath)));
    }
    return mCommand;
}