@org.osgi.service.component.annotations.Activate
public void init() {
    super.init();
    loadPreviousState();
    initDataBaseLink();
}