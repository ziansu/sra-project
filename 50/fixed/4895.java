@java.lang.Override
public void onFailure(java.lang.Throwable caught) {
    this.showcase.append("Informationen konnten nicht geladen werden");
    this.showcase.append(caught.toString());
}