@java.lang.SuppressWarnings(value = "unchecked")
public com.TestWeb.util.PageBean<T> findByDetachedCriteria(org.hibernate.criterion.DetachedCriteria detachedCriteria, com.TestWeb.util.PageBean<T> pageBean) {
    this.pagenation(detachedCriteria, pageBean);
    java.util.List<T> list = ((java.util.List<T>) (this.hibernateTemplate.findByCriteria(detachedCriteria, ((pageBean.getPage()) * (pageBean.getPageSize())), pageBean.getPageSize())));
    pageBean.setResult(list);
    return pageBean;
}