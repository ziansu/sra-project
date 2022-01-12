@org.springframework.web.bind.annotation.RequestMapping(value = "/isSuccessAddNewWorker", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String isSuccessAddNewWorker(@org.springframework.web.bind.annotation.ModelAttribute(value = "worker")
@javax.validation.Valid
com.erp.system.entity.Worker worker, org.springframework.validation.BindingResult result) {
    registrationNewWorkerValidator.validate(registrationNewWorkerValidator, result);
    if (result.hasErrors()) {
        return "pages/addNewWorker";
    }else {
        profileDao.createProfile(profileWorker);
        worker.setProfile(profileWorker);
        workerDao.createWorker(worker);
        return "pages/main";
    }
}