@java.lang.Override
public final void onFailure(java.lang.Throwable caught) {
    this.caught = caught;
    onFailure();
}