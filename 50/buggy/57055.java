@java.lang.Override
public void delFoodParameters(com.yx.sz.laboratory.proStandLibrary.bean.FoodParameters foodParameters) {
    this.getHibernateTemplate().delete(this.getHibernateTemplate().get(foodParameters.getClass(), foodParameters.getId()));
}