@java.lang.Override
public java.lang.Object postProcessAfterInitialization(java.lang.Object bean, java.lang.String beanName) {
    if (beanName.equals("autoData")) {
        checkAndFill(new tel_ran.tests.initiate.UserCreation(((tel_ran.tests.dao.IDataLoader) (bean))));
        checkAndFill(new tel_ran.tests.initiate.CompanyCreation(((tel_ran.tests.dao.IDataLoader) (bean))));
    }else
        if (beanName.equals("testQuestsionsData")) {
            checkAndFill(new tel_ran.tests.initiate.QuestionsCreation(((tel_ran.tests.dao.IDataTestsQuestions) (bean))));
        }
    
    return bean;
}