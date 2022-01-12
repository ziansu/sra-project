@org.zkoss.bind.annotation.Init
public void init() {
    this.customerService = ((business.service.CustomerServiceImpl) (org.zkoss.zkplus.spring.SpringUtil.getBean("customer_service")));
    java.lang.Long customerId = ((java.lang.Long) (org.zkoss.zk.ui.Sessions.getCurrent().getAttribute(CustomerViewModel.SELECTED_CUSTOMER)));
    if (customerId != null) {
        this.currentCustomer = this.customerService.findById(customerId, business.entities.Customer.class);
    }
}