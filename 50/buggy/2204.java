public void setChildrenzParentId() {
    for (java.lang.Object dto : getChildren()) {
        ((com.thoughtworks.lean.sonar.aggreagtedreport.dao.base.BaseDto) (dto)).setParentId(getId());
    }
}