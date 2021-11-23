public static void main(java.lang.String[] args) throws java.sql.SQLException {
    dao.BusinessRuleDAOImpl dao = new dao.BusinessRuleDAOImpl();
    java.util.ArrayList<domain.businessrule.BusinessRule> emptybusinessrules = dao.getEmptyUngeneratedBusinessRules();
    java.util.ArrayList<domain.businessrule.BusinessRule> businessrules = dao.getFilledBusinessRules(emptybusinessrules);
    for (domain.businessrule.BusinessRule b : businessrules) {
        java.lang.System.out.println(b.getGeneratedRule());
    }
}