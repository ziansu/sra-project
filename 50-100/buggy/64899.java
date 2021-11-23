@org.zkoss.bind.annotation.Init
public void init() {
    this.customerService = ((business.service.CustomerServiceImpl) (org.zkoss.zkplus.spring.SpringUtil.getBean("customer_service")));
    java.lang.String customerId = ((java.lang.String) (org.zkoss.zk.ui.Sessions.getCurrent().getAttribute(CustomerViewModel.SELECTED_CUSTOMER)));
    if (!(customerId.isEmpty())) {
        this.currentCustomer = this.customerService.findById(java.lang.Long.parseLong(customerId), business.entities.Customer.class);
    }
}