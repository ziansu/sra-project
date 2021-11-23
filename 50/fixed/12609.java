@java.lang.Override
public void fireValueChanged() {
    updater.update(org.activityinfo.model.type.NarrativeValue.valueOf(this.textArea.getText()));
}