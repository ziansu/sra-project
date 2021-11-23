public java.lang.String execute() throws org.quartz.SchedulerException {
    com.gss.testers.PromoChecker.check();
    com.gss.service.PromoService service = new com.gss.service.PromoServiceImpl();
    this.promoList = service.getAllPromo();
    return "success";
}