public static java.lang.Integer updatePlan(java.lang.Integer id, java.lang.Integer agencyId, java.lang.String name, java.lang.Integer price, java.util.Date starDate, java.util.Date finishDate) {
    DataAccess.Entity.Touristicplan plan = new DataAccess.Entity.Touristicplan();
    plan.setTouristicplanPK(new DataAccess.Entity.TouristicplanPK(id, agencyId));
    plan.setName(name);
    plan.setPrice(price);
    plan.setStartDate(starDate);
    plan.setFinishDate(finishDate);
    return DataAccess.DAO.PlansDAO.updatePlan(plan);
}