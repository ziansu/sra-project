public static co.japo.mindexplotion.service.InternalStorageService getCurrentInstance(android.content.Context appContext) {
    if ((co.japo.mindexplotion.service.InternalStorageService.instance) == null) {
        co.japo.mindexplotion.service.InternalStorageService.instance = new co.japo.mindexplotion.service.InternalStorageService();
        co.japo.mindexplotion.service.InternalStorageService.context = appContext;
        co.japo.mindexplotion.service.InternalStorageService.init();
    }
    return co.japo.mindexplotion.service.InternalStorageService.instance;
}