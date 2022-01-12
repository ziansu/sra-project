@java.lang.Override
public main.com.mentat.nine.domain.ApplicationForm createApplicationForm(main.com.mentat.nine.domain.ApplicationForm app) throws main.com.mentat.nine.dao.exceptions.PersistException {
    main.com.mentat.nine.domain.ApplicationForm createdApplicationForm = appDao.createApplicationForm(app);
    return createdApplicationForm;
}