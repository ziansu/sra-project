public static void setDelivererPropertiesSubmit(java.util.ArrayList<java.lang.Object> data) {
    java.lang.String name = ((java.lang.String) (data.get(0)));
    java.lang.String properties = ((java.lang.String) (data.get(1)));
    if (name.trim().equals("")) {
        java.lang.System.err.println("Empty name is not allowed");
        return ;
    }
    model.customerOrder.Deliverer newDeliverer = new model.customerOrder.Deliverer(name, properties);
    model.repository.DelivererRepository.getInstance().save(newDeliverer);
}