@java.lang.Override
public boolean checkRequired() {
    if ((owningPanel.select2) != null) {
        return owningPanel.select2.checkRequired();
    }
    return super.checkRequired();
}