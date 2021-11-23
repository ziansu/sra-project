@java.lang.Override
public void delFoodParameters(com.yx.sz.laboratory.proStandLibrary.bean.FoodParameters foodParameters) {
    this.getHibernateTemplate().delete(foodParameters);
}