public java.lang.String getUnion(it.screwdrivers.payroll.pojo.employee.Employee e) {
    populateUnionsNames();
    populateUnionServiceAssociations(e);
    service_names = usa_controller.getUnionServiceNames(union_service_associations);
    java.lang.String name_union = null;
    boolean is_union_set = u_controller.isUnionSet(e);
    if (is_union_set == true) {
        name_union = u_controller.findUnionName(e.getUnion());
        this.union = e.getUnion();
    }else {
        name_union = "Not setted";
    }
    return name_union;
}